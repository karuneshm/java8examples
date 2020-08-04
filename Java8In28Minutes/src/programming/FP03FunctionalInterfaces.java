package programming;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,4,6,12,15);
		
		Predicate< Integer> evenPredicate = number -> number%2==0;
		
		Function<Integer, Integer> squaredFunction = number->number*number;
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) ->x+y;
		
		//No Input, return something
		//Supplier
		
		Supplier<Integer> randomIntegerSupplier = () ->  {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		//System.out.println(randomIntegerSupplier.get());
		
		//UnaryOperator
		
		UnaryOperator<Integer> unaryOperator = (x) ->x*3;
		
		System.out.println(unaryOperator.apply(10));
		
		//BiPredicate
		
		BiPredicate<Integer, String> biPredicate = (number,str) ->  {
			return number<10&&str.length()>5;
		};
		
		System.out.println(biPredicate.test(10,"karunesh"));
		
		
		//BiFunction
		
		BiFunction<Integer, String, String> biFunction = (number,str) ->  {
			return number + " " +str;
		};
		
		System.out.println(biFunction.apply(10,"karunesh"));
		
		//BiConsumer
		
		BiConsumer<String, String> biConsumer = (s1,s2) ->  {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept("Karunesh","Maisalge");
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Predicate< Integer> evenPredicate2 = new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer number) {
//				 return number%2 ==0;
//			}
//		};
		
		
		
//		Function<Integer, Integer> squaredFunction2 = new Function<Integer, Integer>() {
//			
//			@Override
//			public Integer apply(Integer number) {
//				return number * number;
//			}
//		};
		
		
		
		
		
//		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer number) {
//				System.out.println(number);
//				
//			}
//		};
				
		
		
		
		
		numbers.stream()
			.filter(evenPredicate) // Predicate
			.map(squaredFunction) // Function
			.forEach(sysoutConsumer); //Consumer
		
		
		
		
		Integer result = numbers.stream().reduce(0, sumBinaryOperator);
		
		System.out.println(result);
		
//		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t + u;
//			}
//		};
		
		
		
		
	    }
	
	  
	
	
	

}
