package qaace22training;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class AdminClass {

	void viewCustomers() {

		//Customerspojo bank=mapper.readValue(new File("data/bank.json"), Customerspojo.class);

		ObjectMapper mapper = new ObjectMapper();
		Bankpojo bank;
		try {
			bank = mapper.readValue(new File("data/bank.json"), Bankpojo.class);
			System.out.println("***********Customer Details****************");
			for(Customerspojo customers: bank.getCustomers()) {

				System.out.println("Customer id: " +customers.getId());
				System.out.println("Customer name: " +customers.getName());
				System.out.println("Customer " + customers.getName() +" has " +customers.getCards().size()+" debit cards" );
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



	private static Customerspojo addCustomer() {
		Bankpojo bank=new Bankpojo();
		Scanner s=new Scanner(System.in);
		int id;
		String name;
		System.out.println("Enter the customer name: ");
		name=s.nextLine();
		System.out.println("Enter the id: ");
		id=s.nextInt();
		//		for(Customerspojo customers1: bank.getCustomers()) {
		//			customers1.setId(id);
		//			customers1.setName(name);
		//			Cardspojo c=new Cardspojo();
		//			bank.setCustomers(Arrays.asList(customers1));
		//			customers1.setCards(Arrays.asList(c));
		//		}
		Customerspojo customer=new Customerspojo();
		Cardspojo cards=new Cardspojo();
		customer.setId(id);
		customer.setName(name);
		bank.setCustomers(Arrays.asList(customer));
		customer.setCards(Arrays.asList(cards));
		return customer;

	}

	void viewCards() {

		ObjectMapper mapper = new ObjectMapper();

		Bankpojo bank1;
		try {
			bank1 = mapper.readValue(new File("data/bank.json"), Bankpojo.class);
			for(Customerspojo customers: bank1.getCustomers()) {
				for(Cardspojo customers1: customers.getCards()) {
					if(customers1.isActive() == false) {
						System.out.println("***********Blocked Cards****************");
						System.out.println("Card number: "+customers1.getCardNum());
						System.out.println("Pin: "+customers1.getPin());
						System.out.println("Balance: "+customers1.getBalance());
						System.out.println("Status: "+customers1.isActive());
					}

				}
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
	void ShowMenu() {
		int option;
		Scanner input=new Scanner(System.in);
		System.out.println("\nHello administrator! ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("\n1. View all customer data");
			System.out.println("2. Add new customer");
			System.out.println("3. Issue new debit card");
			System.out.println("4. View blocked debit cards");
			System.out.println("5. close/block debit card");


			System.out.println("Enter an option: ");
			option = input.nextInt();
			System.out.println("\n");
			try {
				ObjectMapper mapper = new ObjectMapper();
				Scanner s=new Scanner(System.in);
				//Cardspojo card1=mapper.readValue(new File("data/bank.json"), Cardspojo.class);
				//Customerspojo cus=mapper.readValue(new File("data/bank.json"), Customerspojo.class);
				Bankpojo bank1=mapper.readValue(new File("data/bank.json"), Bankpojo.class);
				switch(option) {
				case 1:
					AdminClass view = new AdminClass();
					view.viewCustomers();
					break;

				case 2:


					Customerspojo bank=addCustomer();

					//mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
					//					mapper.enable(SerializationFeature.INDENT_OUTPUT);
					//					mapper.writeValue(new File("data/bank.json"), bank);

					final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bank);

					Files.write(new File("data/bank.json").toPath(), Arrays.asList(json), StandardOpenOption.APPEND);

					System.out.println("Customer is added sucessfully");

					break;

				case 3:
					int cardNum;
					int pin;
					int balance;
					boolean active;
					//List<Customerspojo> customer1 = new ArrayList<Customerspojo>();
					//Bankpojo bank=mapper.readValue(new File("data/bank.json"), Bankpojo.class);
					Customerspojo customer1=mapper.readValue(new File("data/bank.json"), Customerspojo.class);
					String name1;

					for(Customerspojo customers: bank1.getCustomers()) {
						//for(Cardspojo customers1: customers.getCards()) {
						System.out.println("Enter Customer name: ");
						name1=s.nextLine();
						if(name1.contentEquals(customers.getName()))
						{
							Cardspojo cards=new Cardspojo();
							System.out.println("Enter the card no: ");
							cardNum=s.nextInt();
							System.out.println("Enter the pin: ");
							pin=s.nextInt();
							System.out.println("Enter the balance: ");
							balance=s.nextInt();
							System.out.println("Enter status:  ");
							active=s.nextBoolean();
							cards.setCardNum(cardNum);
							cards.setPin(pin);
							cards.setBalance(balance);
							cards.setActive(active);
							customers.setCards(Arrays.asList(cards));
							//															ObjectReader objectReader = mapper.readerForUpdating(customers);
							//															Customerspojo updatedEmployee = objectReader.readValue("data/bank.json");
							//															System.out.println("updated object: " + updatedEmployee);
							//								mapper.enable(SerializationFeature.INDENT_OUTPUT);
							//								mapper.writeValue(new File("data/bank3.json"), customers1);
							final String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customers);

							Files.write(new File("data/bank.json").toPath(), Arrays.asList(json1), StandardOpenOption.APPEND);

							//List<Cardspojo> card=new ArrayList<Cardspojo>();

							//}
						}
						else {
							System.out.println("Customer name is not found");
						}
					}


					break;

				case 4:
					//for(Cardspojo customers: cus.getCards()) {
					//boolean active1;
					AdminClass vc=new AdminClass();
					vc.viewCards();

					break;

				case 5:
					int cardno, pin1;
					for(Customerspojo customers: bank1.getCustomers()) {
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

				default:
					System.out.println("Wrong choice");
					break;
				}

			}
			catch (Exception e){
				e.printStackTrace();

			}

		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
