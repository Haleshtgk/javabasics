package com.xyz.basicsofprogramming.day39;

class Airport{
	 void permit(Plane ref) {
		 ref.takeOff();
		 ref.fly();
		 ref.land();
	 }
 }
public class PolymorphismCode2 {
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
