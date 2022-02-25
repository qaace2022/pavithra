package qaace22training;

import java.util.Scanner;

public class MethodOverloadingExample {
	
	private static void display(int a,int b,int c){
		int sum=a+b+c;
        System.out.println("Sum of 3 numbers: " + sum);
    }

    private static void display(String name){
    	System.out.println("Student Name: " + name);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(50,30,40);
		display("Pavithra");
	}

}
