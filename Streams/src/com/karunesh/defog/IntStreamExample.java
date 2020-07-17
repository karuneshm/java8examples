package com.karunesh.defog;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
	int [] numbers = new  int[] {4,5,7,8,2,3};
	
	int min = IntStream.of(numbers).min().getAsInt();
	System.out.println(min);
	int max = IntStream.of(numbers).max().getAsInt();
	System.out.println(max);
	OptionalDouble avg = IntStream.of(numbers).average();
	System.out.println(avg.getAsDouble());
	long count = IntStream.of(numbers).count();
	System.out.println(count);
	int sum = IntStream.of(numbers).sum();
	System.out.println(sum);
	
	 IntSummaryStatistics summaryStatistics = IntStream.of(numbers).summaryStatistics();
	
	 IntStream.of(numbers)
	          .distinct()
	          .sorted()
	          .limit(3)
	          .forEach(System.out::println);
	 

	}
	
	

}
