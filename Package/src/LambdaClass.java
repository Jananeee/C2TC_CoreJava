interface LambdaOne{
	public void display();
}
public class LambdaClass {

	public static void main(String[] args) {
		new Thread(()-> {System.out.println("This is one method");}).start();
		
		}

}
/*Thread t = new Thread(new Runnable() {
public void run(){
	System.out.println("this is one thread");
}
});
t.start();*/