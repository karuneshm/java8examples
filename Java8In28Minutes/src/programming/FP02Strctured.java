package programming;
import java.util.List;

public class FP02Strctured {

	public static void main(String[] args) {
		
		
		
		List<Integer> numbers = List.of(12,9,4,6,12,15);
		
		int sum = addListStructured(numbers) ;
		
		System.out.println(sum);
		
		

	}

	private static int addListStructured(List<Integer> numbers) {
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	

}
