package week1.day2;

import java.util.Arrays;

public class ArrayMinimumValue {

	public static void main(String[] args) {
		int[] numbers= {23,45,67,32,89,22};
		Arrays.sort(numbers);
		System.out.println("Second smallest number in an array is : " + numbers[1]);

	}

}
