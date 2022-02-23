package qaace22training;

import java.util.*; 

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> array= new ArrayList<String>();
		
		ArrayList<String> letters = new ArrayList<>();  
		letters.add("J");  
		letters.add("A");  
		letters.add("M");
		
		System.out.println(array.isEmpty());
		array.add("December");
		array.add("January");
		array.add("August");
		array.add("November");
		array.add("May");
		System.out.println(array);
		
		//size
		System.out.println("The size of the array is: " +array.size());
		
		//is letters available in month
		System.out.println (letters.addAll(array));
		
		System.out.println(array.get(2));
		
		//overwrite
		array.set(3, "June");
		System.out.println(array);
		
		//remove
		array.remove(3);
		System.out.println("Array List after removing elements: " +array);
	
		//iterators
		Iterator itr=array.iterator();//getting the Iterator  
		   while(itr.hasNext()) {//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		}  
		System.out.println(array);
		
		for(String list:array)    
		    System.out.println(list); 
		
		Collections.reverse(array);
		System.out.println(array);
		
		Collections.sort(array);
		System.out.println(array);
		
		array.clear();
		System.out.println("Clears all the list " + array);

	}

}
