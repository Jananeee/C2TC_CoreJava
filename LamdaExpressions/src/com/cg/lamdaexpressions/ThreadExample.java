package com.cg.lamdaexpressions;

interface Lamb{
	public void demo();
}

public class ThreadExample {

	public static void main(String[] args) {
	 new Thread(()->{System.out.println("this is one thread");}).start();
		
	
	}

}


/*Thread t = new Thread(new Runnable() {
	public void run() {
		System.out.println("this is thread one");
	}
});

t.start();*/