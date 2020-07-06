package com.karunesh;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();	
	}

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		
		Greeting innerInstnce =  new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello World!");
				
			}
		};
		
		innerInstnce.perform();
		
		Greeting myLambdaGreeting = () -> System.out.println("Hello World!");
		
		myLambdaGreeting.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* 
		 * GreetingFunction = () -> System.out.println("Hello World");
		 * 
		 * GreetingFinction = (int a) -> a*2;
		 *             
		 * addFunction = (int a, int b) -> a+b;
		 * 
		 * safeDivideFunction = (int a , int b) -> {
		 * if(b==0) {
		 * return 0;
		 * } else 
		 * {
		 * return a/b;
		 * };
		 * 
		 * stringLenghtFunction = (String s) -> s.length();
		 * 
		 * 
		 * 
		 * */
		
		
		

	}

}





