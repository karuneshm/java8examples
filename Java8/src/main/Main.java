package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee John = new Employee("John", 30);
		Employee Jack = new Employee("Jack", 21);
		Employee karunesh = new Employee("Karunesh", 40);
		Employee snow = new Employee("Snow", 22);

		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(John);
		employees.add(Jack);
		employees.add(karunesh);
		employees.add(snow);
		
		Collections.sort(employees, (Employee employee1,Employee employee2) -> employee1.getName().compareTo(employee2.getName()) );
		
//		for(Employee employee : employees) {
//			System.out.println(employee.getName());
//		}
		
//		String sillyString = doStuff(new UpperContact() {
//			
//			@Override
//			public String upperContact(String s1, String s2) {
//				return s1.toUpperCase() + s2.toUpperCase();
//			}
//		},employees.get(0).getName(), employees.get(1).getName());
		
		//System.out.println(sillyString);
		
		employees.forEach((employee) -> {
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
			
		});
		
		employees.forEach((employee)-> {
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		});
		
		UpperContact uc = (s1,s2)->s1.toUpperCase() + s2.toUpperCase();
		
		UpperContact uc2 = ( s1,  s2) ->  {
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		    };
		
		
		String lambdaString = doStuff(uc2,employees.get(0).getName(), employees.get(1).getName());
		
		//System.out.println(lambdaString);
		
		AnotherClass anotherClass = new AnotherClass();
		System.out.println(anotherClass.doSomething());
		
		
		
		

	}
	
	public final static String doStuff(UpperContact uc, String s1, String s2) {
		return uc.upperContact(s1, s2);
	}

}

   class Employee {
	   
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
   
   
   
 interface UpperContact {
	 public String upperContact(String s1, String s2);
	 
 }

//class CodeToRun implements Runnable  {
//
//	@Override
//	public void run() {
//
//		System.out.println("Printting from the Runnable");
//	}
//	
//}
//
//class CodeToRunFromThread extends Thread {
//	
//	@Override
//	public void run() {
//		System.out.println("Printting from the Thread Class");
//	}
//	
//}
 class AnotherClass {
	 public String doSomething() {
//		 System.out.println("The Another Class class name is" +getClass().getSimpleName());
//		 return Main.doStuff(new UpperContact() {
//			 
//			@Override
//			public String upperContact(String s1, String s2) {
//				System.out.println("The anonymous class Class class name is" +getClass().getSimpleName());
//				return s1.toUpperCase() + s2.toUpperCase();
//			}
//		}, "String1", "String2");
		 
		int i = 0;
		UpperContact uc = (s1,s2)-> {
			System.out.println("The Lambda Expression Class is " + getClass().getSimpleName());
			String result = s1.toUpperCase()+s2.toUpperCase();
			return result;
		};
		
		
//			 UpperContact uc = (s1,s2)-> {
//				System.out.println("The Lambda Expression Class is " + getClass().getSimpleName());
//				String result = s1.toUpperCase()+s2.toUpperCase();
//					return result;
//				};
		 
		
		System.out.println("The Another Class class name is " +getClass().getSimpleName());
		
		return Main.doStuff(uc, "Sting1", "String2");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
    }
 }