package qaace22training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reverseStr = "";
		
		Scanner input = new Scanner(System.in);
		 
        System.out.print("Enter the string : ");
        str = input.nextLine();
	    
	    int strLength = str.length(), i;

	    for (i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.equalsIgnoreCase(reverseStr)) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	}


}
