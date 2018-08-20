package com.mine.thread;

import java.util.concurrent.TimeUnit;

//This is worker class , this will instantiate the thread which intern do the work
public class MyThread {

	public static void main(String[] args) {
		
		Task task = new Task();
		Thread t = new Thread(task);
		t.start();
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("inside main....");

	}

}

//This is work class , work that needs to be accomplished.
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run....");
		go();
	}

	private void go() {
		System.out.println("Inside go....");
		
	}
	
	
}