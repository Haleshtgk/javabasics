package com.xyz.basicsofprogramming.day40;


abstract class Plane{
	 abstract void takeOff();
	 //overridden
	 abstract void fly();
	
	void land() {
		System.out.println("plane landed");
	}
}

class Airport{
	void permit(Plane ref) {
		 ref.takeOff();
		 ref.fly();
		 ref.land();
	 }
}
class CargoPlane extends Plane{
	//@ is called as an annotation which is used for giving extra info to the complier
	@Override
	void fly() {
		System.out.println("cargo plane is flying at low height");
	}
	void carryGoods() {
		System.out.println("cargo plane is carrying goods");
	}
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("cargo plane is takeoff");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane is flying at middum height");
	}
	void carryHumans() {
		System.out.println("Passenger plane is carrying humans");
	}
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane is takeoff");
	}
}
class FighterPlane extends Plane{
	@Override // indicates that method written below is an overridden method
	void fly() {
		System.out.println("Fighter plane is flying at low height");
	}
	void carryWeapans() {
		System.out.println("Fighter plane is carrying weapans");
	}
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Fighter plane is takeoff");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		System.out.println("This is the represenation for cargo plane: ");
		a.permit(cp);
		cp.carryGoods();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("This is the represenation for passenger plane: ");
		a.permit(pp);
		pp.carryHumans();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("This is the represenation for Weapanse plane: ");
		a.permit(fp);
		fp.carryWeapans();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}

}
