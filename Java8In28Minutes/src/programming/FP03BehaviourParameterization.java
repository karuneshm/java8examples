package programming;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviourParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,4,6, 5,12,15);
		
		//filterAndPrint(numbers,  x -> x%2 ==0);
		
		//filterAndPrint(numbers,  x -> x%2 !=0);
		
		//filterAndPrint(numbers,  x -> x%3 ==0);
		
		
		
		List<Integer> squaredNumbers = mapAndCreateList(numbers, x->x*x);
		System.out.println(squaredNumbers);
		
		List<Integer> cubesNumbers = mapAndCreateList(numbers, x->x*x*x);
		System.out.println(cubesNumbers);
		
		List<Integer> doubledNumbers = mapAndCreateList(numbers, x->x*2);
		System.out.println(doubledNumbers);
		
		
		
		
		
		
		
		
	    }

	private static List<Integer> mapAndCreateList(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
				.filter(predicate)
				.forEach(System.out::println);
		
	}
	
	  
	
	
	

}
