package com.karunesh.unit3;

public class MethodReference1 {

	public static void main(String[] args) {
		
		Thread t = new Thread(MethodReference1::printMessage); // MethodReference::printMessage==== ()->printMessage();
		t.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
