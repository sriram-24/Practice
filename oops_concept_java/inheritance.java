package oops_concept_java;
//super class
class cars{

	int cars=10;

}
class carmodel extends cars{  //extends cars
	
	String carmodel="Ford mustang";

}
class carprice extends carmodel{ //extends carmodel is multilevel inheritance
	int carprice=7500000;
}
class availability extends cars{
	Boolean avail=true;
}
class payments extends cars{
	Boolean paid=false;
}

public class inheritance { //base class extends the super class

	public static void main(String[] args) {
	
		carprice in=new carprice();
		
		//single inheritance
		System.out.println("cars:"+in.cars);//prints the value in super class
		
		//Multilevel inheritance
		System.out.println("car model:"+in.carmodel);
		System.out.println("car price:"+in.carprice);
		
		//hierarchical inheritance
		payments pay=new payments();
		System.out.println("cars:"+pay.cars);
		System.out.println("paid:"+pay.paid);
		
	}

}
