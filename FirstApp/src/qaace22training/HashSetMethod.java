package qaace22training;
import java.util.*; 

public class HashSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<String>();
		
		System.out.println("Is the set empty: "+set.isEmpty()); 
		
		set.add("December");
		set.add("January");
		set.add("August");
		set.add("November");
		set.add("May");
		set.add("January");
		set.add("August");
		set.add(null);
		
		System.out.println(set);
		
		
		System.out.println(set.contains("August"));
		
		System.out.println("The size of the set is: " + set.size());
		
		for(String list:set)    
		    System.out.println(list);
		
		set.remove("November");   
        System.out.println("HashSet after removing elements: " + set); 
        
        set.clear();
        System.out.println("Clears all the list " + set);
	}

}
