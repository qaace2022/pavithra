package qaace22training;
import java.io.*;
import java.util.Scanner;

public class UserInputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = null;
		FileOutputStream fileOutputStream = null;
		Scanner data = new Scanner(System.in);

	    System.out.print("Enter the string: ");

	    // takes input from the keyboard
	    String name = data.nextLine();
		//String data = "Hello World.";
		try {
			file = new File("/Users/pavithra.kumar/Documents/File Example/userinput.txt");
			fileOutputStream = new FileOutputStream(file);
			//create file if not exists
			if (!file.exists()) {
				file.createNewFile();
			}
			//fetch bytes from data
			byte[] bs = name.getBytes();
			fileOutputStream.write(bs);
			fileOutputStream.flush();
			fileOutputStream.close();
			System.out.println("File written successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
