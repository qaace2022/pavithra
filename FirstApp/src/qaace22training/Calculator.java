package qaace22training;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		Double a,b,result;
		Scanner num= new Scanner(System.in);
		
		System.out.println("Choose an operator: +, -, *, or / or %");
	    op = num.next().charAt(0);
		
		System.out.println("Enter First Number: ");
		a=num.nextDouble();
		
		System.out.println("Enter Second Number: ");
		b=num.nextDouble();
		
		switch (op) {

	      case '+':
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	      case '-':
	        result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;

	      case '*':
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;

	      case '/':
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;
	        
	      case '%':
		        result = a % b;
		        System.out.println(a + " % " + b + " = " + result);
		        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    num.close();

	}

}
