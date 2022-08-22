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

public class FP03FunctionalInterfaces2 {

	public static void main(String[] args) {
		
	
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		Function<Integer, Integer> SquaredFunction = x-> x*x;
		
		Function<Integer, String> StringOutput = x -> x + " ";
		
		Consumer<Integer> sysOutConsumer = x -> System.out.println(x);
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		
		//supplier -- No input -> Return something
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		//System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer>  unaryOperator = x -> x*3;
		
		//System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number,str) ->   {		
			return number<10 && str.length()>5;		
		};
		
		//System.out.println(biPredicate.test(5, "testing"));
		
		BiFunction<Integer, String, String> biFunction = (number,str) ->   {		
			return number + " " +str;		
		};
		
		//System.out.println(biFunction.apply(5, "testing"));
		
		BiConsumer<Integer, String> biConsumer = (number, str) ->  {
			System.out.println(number + " " + str);
			
		};
		
		biConsumer.accept(10, "Test");
		
		
		
	}

}
