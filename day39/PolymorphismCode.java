package com.xyz.basicsofprogramming.day39;


class Plane{
	void takeOff() {
		System.out.println("plane took off");
	}
	//overridden
	void fly(){
		System.out.println("plane is flying");
	}
	
	void land() {
		System.out.println("plane landed");
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
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("passenger plane is flying at middum height");
	}
	void carryHumans() {
		System.out.println("passenger plane is carrying humans");
	}
}
class FighterPlane extends Plane{
	@Override // indicates that method written below is an overridden method
	void fly() {
		System.out.println("fighter plane is flying at high height");
	}
	void carryWeapans() {
		System.out.println("fighter plane is carrying weapans");
	}
}
public class PolymorphismCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Plane ref;
		System.out.println("This is the represenation for cargo plane: ");
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("This is the represenation for passenger plane: ");
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("This is the represenation for Weapanse plane: ");
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapans();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}

}