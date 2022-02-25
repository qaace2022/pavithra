package qaace22training;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "Pavithra", myString2 = "Kumar", myString3="Pavithra";
		String s="    hello   ", s1="";
		
		System.out.println(myString.equals("pavi"));

		//concat returns both strings will join
		System.out.println(myString.concat(myString2));

		//compareto compares both string and return true or false
		System.out.println(myString.compareTo(myString3));

		//uppercase returns converts all to capital letters
		System.out.println(myString.toUpperCase());
		
		//charAt returns letter of 5th position
		System.out.println(myString.charAt(5));

		//length returns length of string
		System.out.println(myString.length());

		//equals compares string and return true or false
		

		//lowercase returns converts all to lowercase
		System.out.println(myString.toLowerCase());

		//trim returns all whitesapces will be removed
		System.out.println(s.trim());

		//joins two number
		System.out.println(s1.join(":","10","30"));

		//contains returns if string exists or not and return true or false
		System.out.println(myString.contains("avi"));

		//isEmpty checks if string is present or not and returns true or false
		System.out.println(s1.isEmpty());
	}

}
