package com.karunesh.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.karunesh.Person;

public class CollectionIterationExample {

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
		
//	   persons.forEach((Person person)->{
//		   System.out.println(person);
//		      
//	   });
	   
	   persons.forEach(p -> System.out.println(p));
	   
	   persons.forEach(System.out::println);
	   
//	   printConditionally(persons, new Condition() {
//		
//		@Override
//		public boolean test(Person p) {
//			return p.getFirstName().startsWith("c");
//		}
//	});
	   
	  
	   
	  // performConditionally(persons,p->true,System.out::println); // p->Sout(p) === System.out::println
		
	
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
