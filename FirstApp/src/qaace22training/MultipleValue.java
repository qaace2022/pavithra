package qaace22training;

final class Student

{

	public String n;

	public int a;

	public char g;

	public Student(String name, int age, char gender)

	{
		this.n = name;
		this.a = age;
		this.g = gender;

	}

}

public class MultipleValue {


		public static Student getDetails()

		{

			// return person details from the method

			String name = "Pavithra";

			int age = 23;

			char gender = 'F';

			return new Student(name, age, gender);



		}
		// Return multiple values from a method in Java

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Student person = getDetails();

				System.out.println("Name is " + person.n);

				System.out.println("Age is " + person.a);

				System.out.println("Gender is " + person.g);

	}

}
