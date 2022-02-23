package qaace22training;
import java.util.*; 

public class HashMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"December");
		map.put(2,"January");
		map.put(3,"August");
		map.put(4,"November");
		map.put(5,"May");
		map.put(3,"August");
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey("August"));
		System.out.println(map.containsValue(4));
		System.out.println(map.get("November"));

		
		 for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());   
		 }
		 
		 map.remove("August");
		 System.out.println("HashMap after removing elements: " + map);
		 
		 System.out.println("The size of the set is: " + map.size());
		 
		 Set set2 = map.entrySet();
		 Iterator it = set2.iterator();
		 while(it.hasNext()) {
	          Map.Entry m2 = (Map.Entry)it.next();
	          System.out.print("Key is: "+m2.getKey() + " & Value is: ");
	          System.out.println(m2.getValue());
	       }
		 
		 map.clear();
		 System.out.println("Clears all the list " + map);
		 
		 


	}

}
