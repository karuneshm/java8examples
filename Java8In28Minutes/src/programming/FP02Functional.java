package programming;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		
		
		
		List<Integer> numbers = List.of(12,9,4,6,12,15);
		
		List<String> courses = 
				List.of("Spring","Spring Boot","API","MicroServices",
						"AWS","PCF","Azure","Docker","Kubernetes");
		
		int sum = addListFunctional(numbers) ;
		
		//System.out.println(sum);
		
		List<Integer> doubleList = lengthofCoursesList(courses);
		
		//System.out.println(doubleList);
		
		List<Integer> evenNumbers = evenNumbers(numbers);
		
		System.out.println(evenNumbers);
		
		

	}
	
	private static List<Integer> doubleListNumbers(List<Integer> numbers) {
		
		return numbers.stream()
				.map(number -> number*number)
				.collect(Collectors.toList());
	}
	
	private static List<Integer> evenNumbers(List<Integer> numbers) {
		
		return numbers.stream()
				.filter(number -> number%2 ==0)
				.collect(Collectors.toList());
	}
	
	private static List<Integer> lengthofCoursesList(List<String> courses) {
		
		return courses.stream()
					.map(course ->course.length())
					.collect(Collectors.toList());
		
	}

	private static int sum(int aggregate , int number) {
		System.out.println(aggregate + " " +number);
		return aggregate+number;
	}

	private static int addListFunctional(List<Integer> numbers) {
		//acculamator
//		return numbers.stream()
//		       .reduce(0,FP02Functional::sum);
		
//		return numbers.stream()
//					.reduce(0, (a,b) -> a+b);
		
		return numbers.stream()
				.reduce(0, Integer::sum);
		
		
		
	}		
	
	

}
