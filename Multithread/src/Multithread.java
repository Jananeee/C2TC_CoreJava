class Eclipse extends Thread{
	public void run(){
		for (int i=0;i<6;i++) {
		System.out.println("Eclipse thread Id:" +Thread.currentThread().getId());
		
		try{
			sleep(5000);
		}
		catch(Exception E){
			System.out.println();
		}
		}
		
	}
}


public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse obj1 = new Eclipse();
		obj1.start();
		
	}

}
