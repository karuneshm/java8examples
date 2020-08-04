package programming;
import java.util.List;

public class FP02Excercise {

	public static void main(String[] args) {
		
		
		
		List<Integer> numbers = List.of(12,9,4,6,12,15);
		
		int sum = addListFunctional(numbers) ;
		
		System.out.println(sum);
		
		

	}
	
	

	private static int addListFunctional(List<Integer> numbers) {

//		return numbers.stream()
//						.map(x -> x*x)
//						.reduce(0, Integer::sum);
		
//		return numbers.stream()
//				  .map(x -> x*x*x)
//				  .reduce(0, Integer::sum);
		
		return numbers.stream()
				     .filter(number -> number%2!=0)
				     .reduce(0, Integer::sum);
		
		
		
		
		
	}		
	
	

}
