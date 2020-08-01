package oops_concept_java;

 class EncapsulationOperation{
	//initializing or declaring the variables in private 
		private String carname;
		private String carmodel;
		private int carprice;
		
		//return variables
		public String retcar() { 
			return carname; //returns carname to main class as string
		}
		public String retmodel() {
			return carmodel; //returns carmodel to main class as string
			
		}
		public int retprice() {
			return carprice;  //returns carprice to main class as integer
		}
		
		public void getcarname(String name) {
			carname=name;  //set name value to the carname variable 
		}
		public void getcarmodel(String model) {
			carmodel=model; //set model value to the carmodel variable 
			
		}
		public void getcarprice(int price) {
			carprice=price;  //set price value to the carprice variable 
		}
}
//main class
public class Encapsulation {
	

	public static void main(String[] args) {
	
		EncapsulationOperation en= new EncapsulationOperation();//creating object to the class
		
		en.getcarname("Ford mustang"); //calling getcarname method and passing carname
		en.getcarmodel("model 1"); //calling getcarmodel method and passing carmodel
		en.getcarprice(7500000);  //calling getcarprice method and passing carprice
		
		// printing values
		System.out.println("price:"+en.retprice());
		System.out.println("car name:"+en.retcar());
		System.out.println("car model : "+en.retmodel());
		
		//updating values
		System.out.println("after updation:");
		en.getcarmodel("model 2 version 4");// updating carmodel value 
		System.out.println("car model : "+en.retmodel());//print values
	}
}
