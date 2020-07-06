package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String args[]) {
		
	Employee John = new Employee("John wick", 30);
	Employee Jack = new Employee("Jack ryan", 21);
	Employee karunesh = new Employee("Karunesh Maisalge", 40);
	Employee snow = new Employee("Snow fil", 32);
	Employee red = new Employee("Red hot", 25);
	Employee lokesh = new Employee("Lokesh M", 35);

	
	List<Employee> employees = new ArrayList<Employee>();
	
	employees.add(John);
	employees.add(Jack);
	employees.add(karunesh);
	employees.add(snow);
	employees.add(red);
	employees.add(lokesh);
	
//	System.out.println("Employess over 30");
//	System.out.println("--------");

	
	
//	employees.forEach((employee) -> {
//		System.out.println(employee.getName());
//		System.out.println(employee.getAge());
//		
//	});
//	
//	/*----Same as below*/
//   Consumer Functiona Interface ..Method accept... ForEach -- Consumer...
//   Consumer accepts one argument and returns void
//	employees.forEach(new Consumer<Employee>() {
//		@Override
//		public void accept(Employee employee) {
//			System.out.println(employee.getName());
//			System.out.println(employee.getAge());
//		}
//	});
	
//	for(Employee employee : employees) {
//		if(employee.getAge() >30) {
//			System.out.println(employee.getName());
//		}
//	}  
	
	//-- Same as below
	
//	employees.forEach((employee) -> {
//		if(employee.getAge() >30) {
//			System.out.println(employee.getName());
//		}
//	});
//	
//	System.out.println("Employess 30 and Younger");
//	System.out.println("--------");
//	
//	employees.forEach((employee) -> {
//		if(employee.getAge() <= 30) {
//			System.out.println(employee.getName());
//		}
//	});
	
	//predicate -- returns boolean 
	// Accepts a one paramter and returns a boolean value
	
	// same as below
	
//	printEmployeesByAge(employees, "Employess over 30", employee -> employee.getAge()>30);
//	printEmployeesByAge(employees, "Employess under 30", employee -> employee.getAge()<=30);
//	printEmployeesByAge(employees, "Employees younger than 25", new Predicate<Employee>() {
//		
//		@Override
//		public boolean test(Employee employee) {
//			if(employee.getAge() <25) {
//				return true;
//			}
//			return false;
//		}
//	});
	
//	IntPredicate intp = i -> i>15;
//	System.out.println(intp.test(10));
	
	IntPredicate greaterThan = i -> i>15;
	IntPredicate lessThan = i -> i<100;
	System.out.println(greaterThan.and(lessThan).test(50));
	
	System.out.println(greaterThan.and(lessThan).test(14));
	
	// Consumer --> accept --- accepts one argument but doent return anything
	// Predicate --> test -- accepts onr parameter but return boolean
	// Supplier -- > get method --doesnt accept anything but returns the value
	
	
	
	//Supplier doesnt accept any argument but does return value
//	Random random = new Random();
	
//	Supplier<Integer> randomSupllier = ()-> random.nextInt(100);
//	for(int i = 0; i< 10; i++) {
//		System.out.println(randomSupllier.get());
//	}
	
//	Supplier<Integer> randomSupplier = new Supplier<Integer>() {
//		
//		@Override
//		public Integer get() {
//			// TODO Auto-generated method stub
//			return random.nextInt(100);
//		}
//	};
//	
//	for(int i = 0; i< 10; i++) {
//		System.out.println(randomSupplier.get());
//	}
	
	
	Function<Employee, String> getLastName = (Employee employee)-> {
		return employee.getName().substring(employee.getName().indexOf(' ')+1);
	};
	
	System.out.println(getLastName.apply(employees.get(2)));
	
	Function<Employee, String> getFirstName = (Employee employee) -> {
		return employee.getName().substring(0, employee.getName().indexOf(' '));
	};
	System.out.println(getFirstName.apply(employees.get(2)));
	
	Function<Employee, String> uppercase = (Employee employee) -> employee.getName().toUpperCase();
	Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
	Function chainedFunction = uppercase.andThen(firstName);
	System.out.println(chainedFunction.apply(employees.get(2)));
	
	
	
	

	}
	
	private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
		System.out.println(ageText);
		System.out.println("--------");
		for(Employee employee : employees) {
			if(ageCondition.test(employee)) {
				System.out.println(employee.getName());
			}
			
		}
	 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
