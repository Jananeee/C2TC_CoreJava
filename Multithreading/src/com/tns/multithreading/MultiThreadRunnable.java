package com.tns.multithreading;

class Eclipse_ implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse thread Id is" +Thread.currentThread().getId());
		}
	}
}
class PPT_ implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT thread Id is" +Thread.currentThread().getId());
		}
	}
}
class NotePad_ implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Notepad thread Id is" +Thread.currentThread().getId());
		}
	}
}

public class MultiThreadRunnable {

	public static void main(String[] args) {
		Eclipse_ obj1 = new Eclipse_();
		Thread t = new Thread(obj1);
		t.start();
		PPT_ obj2 = new PPT_();
		Thread t1 = new Thread(obj2);
		t1.start();
		NotePad_ obj3 = new NotePad_();
		Thread t2 = new Thread(obj3);
		t2.start();
		
	}

}
