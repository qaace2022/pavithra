package qaace22training;
import java.util.Arrays;
import java.util.Scanner;

public class SumAndProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      int[] array = new int[5];
	      int sum = 0, product=1;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<5; i++)
	      {
	    	  array[i] = scanner.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	          product *=num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	      System.out.println("Product of array elements is:"+product);
	   
	}

}
