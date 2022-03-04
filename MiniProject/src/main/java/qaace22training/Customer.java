package qaace22training;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Customer {


	void ShowMenu() {
		int option;
		System.out.println("Enter the choice: ");
		Scanner input=new Scanner(System.in);
		System.out.println("Hello Customer \n");
		for(int i=1;i<=4;i++)
		{
			System.out.println("\n1. View balance");
			System.out.println("2. Close/block debit card");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");


			System.out.println("Enter an option: ");
			option = input.nextInt();
			System.out.println("\n");
			try {
				ObjectMapper mapper = new ObjectMapper();
				Scanner s=new Scanner(System.in);
				//			Customerspojo cus=mapper.readValue(new File("data/bank.json"), Customerspojo.class);
				//			Cardspojo card=mapper.readValue(new File("data/bank.json"), Cardspojo.class);
				int cardnum, pin;
				Bankpojo bank=mapper.readValue(new File("data/bank.json"), Bankpojo.class);
				//for(Cardspojo customers: cus.getCards()) {
				switch(option) {
				case 1:

					System.out.println("Enter the card number:");
					cardnum=s.nextInt();
					for(Customerspojo customers: bank.getCustomers()) {
						for(Cardspojo customers1: customers.getCards()) {
							if(cardnum == (customers1.getCardNum())) {
								System.out.println("Enter the pin: ");
								pin=s.nextInt();
								if(pin == (customers1.getPin()))
								{
									System.out.println("Balance of "+customers.getName()+" is "+customers1.getBalance());

								}
								else {
									System.out.println("Pin is incorrect");
								}


							}

							else {
								System.out.println("Card number is incorrect ");
							}
							break;
						}
						break;
					}

					break;

				case 2:
					int cardno, pin1;
					for(Customerspojo customers: bank.getCustomers()) {
						for(Cardspojo customers1: customers.getCards()) {
							System.out.println("Enter the card no");
							cardno=s.nextInt();
							if(cardno == customers1.getCardNum())
							{
								System.out.println("Enter the pin");
								pin1=s.nextInt();
								if(pin1 == customers1.getPin())
								{
									customers1.setActive(false);

									customers.setCards(Arrays.asList(customers1));
									System.out.println("You card is successfully blocked");
									final String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customers);

									Files.write(new File("data/bank.json").toPath(), Arrays.asList(json2), StandardOpenOption.APPEND);

								}
								else {
									System.out.println("Invalid pin");
								}

								break;
							}
							else {
								System.out.println("Invalid card number");
							}
						}

					}
					break;

				case 3:

					for(Customerspojo customers: bank.getCustomers()) {
						for(Cardspojo customers1: customers.getCards()) {
							System.out.println("Enter the card number:");
							cardnum=s.nextInt();
							if(cardnum == (customers1.getCardNum())) {
								System.out.println("Enter the pin: ");
								pin=s.nextInt();
								if(pin == (customers1.getPin()))
								{
									long amt,balance;  
									System.out.println("Enter the amount you want to deposit: ");  
									amt = s.nextLong();  
									//balance = customers1.setBalance() + amt;

									mapper.writeValue(new File("data/bank.json"), customers1);
								}
							}
						}
					}
					break;

				case 4:
					for(Customerspojo customers: bank.getCustomers()) {
						for(Cardspojo customers1: customers.getCards()) {
							System.out.println("Enter the card number:");
							cardnum=s.nextInt();
							if(cardnum == (customers1.getCardNum())) {
								System.out.println("Enter the pin: ");
								pin=s.nextInt();
								if(pin == (customers1.getPin()))
								{
									long amt,balance;  
									System.out.println("Enter the amount you want to deposit: ");  
									amt = s.nextLong();  
									//balance = customers1.setBalance() - amt;

									mapper.writeValue(new File("data/bank.json"), customers1);
								}
							}
						}
					}
					break;

				default:
					System.out.println("Wrong choice");
					break;
				}
			}
			catch(Exception e) {
				e.printStackTrace();

			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
}