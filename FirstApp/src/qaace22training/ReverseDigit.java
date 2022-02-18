package qaace22training;

import java.util.Scanner;

public class ReverseDigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		 
        System.out.print("Enter Value of number : ");
        int number = input.nextInt();
		String str = String.valueOf(number);
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		number = Integer.parseInt(builder.toString());
		System.out.println(number);

	}

}
