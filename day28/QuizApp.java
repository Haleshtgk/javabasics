package com.xyz.basicsofprogramming.day28;

import java.util.Random;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("\nWelcome to the Quiz Game, " + playerName + "!");
        System.out.println("Rules:");
        System.out.println("1. You will be asked 10 questions.");
        System.out.println("2. For each correct answer, you will earn money as per the money chart below.");
        System.out.println("3. You have two lifelines: Phone a Friend and 50/50. You can use each lifeline only once.");
        System.out.println("4. If you answer incorrectly, the game will end.");
        System.out.println("5. After each correct answer, you can choose to continue or quit the game.");
        System.out.println("6. Type '1' to continue or '0' to quit the game after each question.\n");

        
        System.out.println("Money Chart:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Question " + i + ": $" + (i * 100));
        }
        System.out.println(); 

 
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. Who wrote 'Hamlet'?",
            "4. What is the largest ocean on Earth?",
            "5. Who painted the Mona Lisa?",
            "6. What is the powerhouse of the cell?",
            "7. What is the square root of 64?",
            "8. What is the currency of Japan?",
            "9. Which gas do plants absorb from the atmosphere?",
            "10. Who developed the theory of relativity?"
        };

 
        String[][] options = {
            {"1. Paris", "2. London", "3. Rome", "4. Berlin"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"1. Charles Dickens", "2. J.K. Rowling", "3. William Shakespeare", "4. Mark Twain"},
            {"1. Atlantic", "2. Indian", "3. Arctic", "4. Pacific"},
            {"1. Vincent van Gogh", "2. Pablo Picasso", "3. Leonardo da Vinci", "4. Claude Monet"},
            {"1. Nucleus", "2. Mitochondria", "3. Ribosome", "4. Cytoplasm"},
            {"1. 6", "2. 7", "3. 8", "4. 9"},
            {"1. Yuan", "2. Yen", "3. Dollar", "4. Won"},
            {"1. Oxygen", "2. Carbon Dioxide", "3. Nitrogen", "4. Hydrogen"},
            {"1. Isaac Newton", "2. Galileo Galilei", "3. Nikola Tesla", "4. Albert Einstein"}
        };

       
        int[] correctAnswers = {1, 2, 3, 4, 3, 2, 3, 2, 2, 4};

       
        int score = 0;
        int earnings = 0;
        boolean phoneAFriendUsed = false;
        boolean fiftyFiftyUsed = false;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            
            if (!phoneAFriendUsed || !fiftyFiftyUsed) {
                System.out.println("Do you want to use a lifeline? (1 for Yes, 0 for No): ");
                int useLifeline = scanner.nextInt();

                if (useLifeline == 1) {
                    System.out.println("Choose your lifeline: 1 for Phone a Friend, 2 for 50/50");
                    int lifelineChoice = scanner.nextInt();

                    if (lifelineChoice == 1 && !phoneAFriendUsed) {
                        
                        System.out.println("Hint: The answer might be option " + correctAnswers[i] + ".");
                        phoneAFriendUsed = true;
                    } else if (lifelineChoice == 2 && !fiftyFiftyUsed) {
                  
                        System.out.println("50/50 Lifeline: Here are two options:");
                        System.out.println(options[i][correctAnswers[i] - 1]);

                       
                        int wrongAnswer;
                        do {
                            wrongAnswer = random.nextInt(4);  
                        } while (wrongAnswer == correctAnswers[i] - 1);  

                        System.out.println(options[i][wrongAnswer]);
                        fiftyFiftyUsed = true;
                    } else {
                        System.out.println("You've already used this lifeline or invalid choice.");
                    }
                }
            }

  
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

          
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
                earnings += (i + 1) * 100;  
                System.out.println("Congratulations! You earned $" + ((i + 1) * 100) + ". Your total earnings: $" + earnings);
            } else {
                System.out.println("Incorrect! Game Over.\n");
                break;  
            }

            
            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
            int continueGame = scanner.nextInt();
            
            if (continueGame == 0) {
                System.out.println("Thank you for playing, " + playerName + "!");
                break; 
            }
        }

        System.out.println("\nGame over!");
        System.out.println("Your final score: " + score + "/" + questions.length);
        System.out.println("Your total earnings: $" + earnings);
        scanner.close();
    }
}

