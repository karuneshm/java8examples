package com.karunesh;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLength strLenthMyLamdba =s -> s.length();
		System.out.println(strLenthMyLamdba.getLength("Karunesh"));
		
		printStringLength(s->s.length());

	}
	public static void printStringLength(StringLength s) {
		System.out.println(s.getLength("Karunesh"));
		
	}
	interface StringLength {
		int getLength(String s);
	}

}
