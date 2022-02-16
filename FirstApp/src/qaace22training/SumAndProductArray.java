package qaace22training;
import java.util.Arrays;

public class SumAndProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,2,5,8,3,6,5,6,7,4,5,2,9,6,4,4,7,8,6,2};
		int sum = 0, product = 1;
		for(int x: arr)
		{
		  sum += x;
		  product *= x;

		}
		System.out.println("Given Array: " + Arrays.toString(arr));

		System.out.println("Sum of elements: " + sum);

		System.out.println("Product of elements: " + product);

	}

}
