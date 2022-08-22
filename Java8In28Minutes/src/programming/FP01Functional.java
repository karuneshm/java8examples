package programming;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,4,6,12,15);
		printAllNumberInListFunctional(numbers);
		//printEvenNumberInListFunctional(numbers);
		
		//printSquaresOfEvenNumberInListFunctional(numbers);

	}
	
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printAllNumberInListFunctional(List<Integer> numbers) {

		// Convert to stream

//		numbers.stream()
//			   .forEach(FP01Functional::print); //Method Refernce

		numbers.stream().forEach(System.out::println);

	}
	
	private static void printEvenNumberInListFunctional(List<Integer> numbers) {

		// with filter 1st Approach
//		numbers.stream()
//				.filter(FP01Functional::isEven)
//				.forEach(System.out::println);

		// 2nd Approach
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

		// Without Filter
//		numbers.stream().forEach((number)-> {
//			if(number % 2 == 0) {
//				System.out.println(number);
//			}
//		});
	}
	
private static void printSquaresOfEvenNumberInListFunctional(List<Integer> numbers) {

		//2nd Approach
		numbers.stream()
			.filter(number -> number%2==0)
			.map( number -> number*number)
			.forEach(System.out::println);
		
		

	}
	


}
