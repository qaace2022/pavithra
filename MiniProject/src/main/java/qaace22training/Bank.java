package qaace22training;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Bank {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;

		Scanner input=new Scanner(System.in);
		System.out.println("Select the user type - \n");
		System.out.println("1. Admin");
		System.out.println("2. Customer");

		System.out.println("Enter an option: ");
		option = input.nextInt();
		System.out.println("\n");

		ObjectMapper mapper = new ObjectMapper();
		Bankpojo bank;
		try {
			bank = mapper.readValue(new File("data/bank.json"), Bankpojo.class);
			switch(option) {
			case 1:
				String username,password;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the username: ");
				username=s.nextLine();
				if(username.contentEquals(bank.getAdmin().username))
				{
					System.out.println("Enter the password: ");
					password=s.nextLine();

					if(password.contentEquals(bank.getAdmin().password))
					{

						AdminClass admin=new AdminClass();
						admin.ShowMenu();
					}
					else {
						System.out.println("Password is incorrect");
					}
				}
				else {
					System.out.println("Username is incorrect");
				}

				break;

			case 2:

				Customer customer=new Customer();
				customer.ShowMenu();
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
