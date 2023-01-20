package com.thread;
/*
 * Thread :
 * 1. it is a light weight process
 * 2. completely depends on process or processor
 * 3. when you execute some task
 * 4. main() is a thread
 * 
 * MultiThreading
 * 1. n number of threads working simultaneously in a single program
 * 2. Round Robin Algorithm
 * 3. Multitasking, Multiprocessing, MultiThreading
 * 
 * 
 * Thread life cycle
 * 1. new born state
 * 2. runnable state
 * 3. running state
 * 4. wait state
 * 5. dead state
 *
 * Thread can be created with two ways :
 *  1. by extending thread class
 *  2.  by implementing runnable interface
 *  
 */

class First extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("my first thread is .........."+i);
		}
		System.out.println("first thead completed");
	}
}
public class ThreadDemo {
public static void main(String[] args) {
//	Thread t1=Thread.currentThread();
//	t1.setName("java class");
//	System.out.println(t1);
	
	First f1=new First();
	f1.start();
	
	for (int i = 1; i <= 5; i++) {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("my main thread is .........."+i);
	}
	System.out.println("first main  thead completed");

}


}

