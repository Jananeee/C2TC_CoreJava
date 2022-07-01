package com.cg.lambdaexp;

interface Lambda{
	public void demo();
}

public class ThreadDemo {
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

