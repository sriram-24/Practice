package oops_concept_java;
class MethodOverloading{
	void bently(){
		System.out.println("bently details");
	}
	void bently(int price) {
		System.out.println("Price:"+price);
	}
	void bently(String color,Boolean avail) {
		System.out.println("Color:"+color+"\nAvailability:"+avail);
	}
}

//method overriding

class Mustang{
	void getprice() {
		System.out.println("Mustang price:7500000");
	}
}
class Bently extends Mustang{
	void getprice() {
		System.out.println("Bently price:30000000");
	}
}


public class Polymorphism {
	
	public static void main(String args[]) {
		
		//method overloading
		MethodOverloading in=new MethodOverloading();
		in.bently();
		in.bently(30000000);
		in.bently("black",false);
		
		//method overriding
		Bently b =new Bently();
		b.getprice();
	}
}
