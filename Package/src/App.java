/*class App_One{
	void display(){
		System.out.println("Iam from display method");
	}
}*/

interface Lambda{
	public void display();  // abstract method
}

public class App {

	public static void main(String[] args) {
	Lambda obj = ()->{
		System.out.println("Iam from display metod");	
		System.out.println("Iam from display metod");	
		System.out.println("Iam from display metod");	
		System.out.println("Iam from display metod");	
	};
	obj.display();
	}

}
