class counter{
	int count;
	public void increment() {
		count++;
	}
	
}
public class Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		counter c = new counter();
		Thread t = new Thread(new Runnable() {
			public void run() {
			for(int i=0;i<1000;i++) {
				c.increment();
			}
				
			}
		});
		t.start();
		t.join();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		t2.start();
		t2.join();
		System.out.println(c.count);
	}
		

	}


