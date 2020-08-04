package oops_concept_java;
abstract class cars{
	String carname;
	abstract void getDetails(String carname,int price);
	

}

class ford extends cars{

void getDetails(String carname, int price) {
	System.out.println("ford");
	System.out.println(carname);
	System.out.println(price);
}
	
	

}
class bmw extends ford{
	void getDetails(String carname,int price) {
		System.out.println("bmw");
		System.out.println(carname);
		System.out.println(price);
	}
}
public class abstraction {
	
 public static void main(String[] args) {
	cars b=new ford();
	b.getDetails("mustang", 7500000);
	bmw w= new bmw();
	w.getDetails("series x", 4500000);
	
}
}
