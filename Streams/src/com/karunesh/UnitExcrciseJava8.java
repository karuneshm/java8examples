package com.karunesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExcrciseJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			new Person("a","b",21),
			new Person("c","d",21),
			new Person("e","f",21),
			new Person("g","h",21),
			new Person("i","j",21),
			new Person("k","l",21));
		
		//Sort by lastName;
		Collections.sort(persons, (p1, p2) -> {
			return p1.getLastName().compareTo(p2.getLastName());
		});
		
	   persons.forEach((Person person)->{
		   System.out.println(person);
		      
	   });
	   
//	   printConditionally(persons, new Condition() {
//		
//		@Override
//		public boolean test(Person p) {
//			return p.getFirstName().startsWith("c");
//		}
//	});
	   
	   printConditionally(persons, p-> p.getFirstName().startsWith("c"));
	   
	   printConditionally(persons, p-> p.getLastName().startsWith("h"));
	   
	   performConditionally(persons,p->true,p->System.out.println(p));
		
		
		//Create 
		
				
	}
	
	private static void printConditionally(List<Person> persons, 
			Predicate<Person> predicate) {
		for(Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
		
	}
	
	private static void performConditionally(List<Person> persons, 
			Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person : persons) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
		
	}

}


