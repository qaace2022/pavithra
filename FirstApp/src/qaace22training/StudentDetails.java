package qaace22training;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
        int roll, math, phy, eng, bio;
         
        Scanner input=new Scanner(System.in);
         
        System.out.print("Enter Student Name: ");
        name=input.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=input.nextInt();
        System.out.print("Enter marks in Maths: ");
        math=input.nextInt();
        System.out.print("Enter marks in Physics: ");
        phy=input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        eng=input.nextInt();
        System.out.print("Enter marks in Biology: ");
        bio=input.nextInt();
         
        int total=math+eng+phy+bio;
        float perc=(float)total/400*100;
         
        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks (Maths, Physics, Chemistry, Biology): " +math+","+phy+","+eng+","+bio);
        System.out.println("Total: "+total +"\nPercentage: "+perc);
	}

}
