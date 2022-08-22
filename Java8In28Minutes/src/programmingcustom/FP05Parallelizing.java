package programmingcustom;

import java.util.stream.LongStream;

public class FP05Parallelizing {

	public static void main(String[] args) {
		
		Long time = System.currentTimeMillis();
		System.out.println(LongStream.range(0,1000000000).parallel().sum());
		System.out.println(System.currentTimeMillis()-time);
	}

}
