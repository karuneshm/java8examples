package com.karunesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcrciseJava7 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			new Person("a","b",21),
			new Person("c","d",21),
			new Person("e","f",21),
			new Person("g","h",21),
			new Person("i","j",21),
			new Person("k","l",21));
		
		//Sort by lastName;
		Collections.sort(persons,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
	   persons.forEach((Person person)->{
		   System.out.println(person);
		      
	   });
	   
	   printConditionally(persons, new Condition() {
		
		@Override
		public boolean test(Person p) {
			return p.getFirstName().startsWith("c");
		}
	});
		
		
		//Create 
		
				
	}
	
	private static void printConditionally(List<Person> persons, 
			Condition condition) {
		for(Person person : persons) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}

}


interface Condition {
	boolean test(Person p);
}
