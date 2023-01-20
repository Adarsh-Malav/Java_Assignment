package com.thread;

class Second implements Runnable{
	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("this is my second thread..."+i);
		}
		System.out.println("Second thread is completed");
	}
}

public class RunnableDemo {
public static void main(String[] args) {
	Second s1=new Second();
	Thread t1=new Thread(s1);
	
	
	t1.start();
	t1.setPriority(10);  //1 min    10 max    5 normal    priority

	System.out.println(t1);
	
	for (int i = 1; i <=5; i++) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this is my main thread..."+i);
	}
	System.out.println("Second main thread is completed");
}
}
