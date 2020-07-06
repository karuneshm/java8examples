package com.karunesh;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myRunnableInner = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable Inner");
				
			}
		});
		
		myRunnableInner.start();
		
		Thread myRunnable = new Thread(()->System.out.println("Runnable"));
		myRunnable.start();
		
		Runnable r = ()->System.out.println("Runnable Runnable");
		
		Thread myRunnable2 = new Thread(r);
		myRunnable2.start();

	}

}
