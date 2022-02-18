package qaace22training;
import java.util.Scanner;

public class ReverseString {
	
	public static String rString(String s){

		char ch[]=s.toCharArray();

		String rev="";

		for(int i=ch.length-1;i>=0;i--)
		{

			rev+=ch[i];

		}

		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;

		Scanner input = new Scanner(System.in);
		 
        System.out.print("Enter the string : " );
        str= input.nextLine();
        
        System.out.println(rString(str));
        
	}

}
