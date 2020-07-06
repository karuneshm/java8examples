package com.karunesh;

import java.util.Arrays;
import java.util.List;


public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("a","b",21),
				new Person("c","d",21),
				new Person("e","f",21),
				new Person("g","h",21),
				new Person("i","j",21),
				new Person("k","l",21));
		
		
		persons.stream()
				.filter(p -> p.getFirstName().startsWith("c"))
				.forEach(p->System.out.println(p.getFirstName()));
		long count = persons.stream()
		.filter(p -> p.getFirstName().startsWith("c"))
		.count();
		
		System.out.println(count);
		
			
	}

}
