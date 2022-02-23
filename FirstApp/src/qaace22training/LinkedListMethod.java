package qaace22training;
import java.util.*; 

public class LinkedListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		 
		
		linkedlist.add("December");
		linkedlist.add("January");
		linkedlist.add(null);
		linkedlist.addLast("March");
		linkedlist.addFirst("November");
		
		linkedlist.add(2, "August");
 
        System.out.println(linkedlist);
        
        System.out.println("The size of the set is: " + linkedlist.size());
        
        System.out.println("Element at index 3 is : " + linkedlist.get(3));
 
        linkedlist.set(1, "July");
        System.out.println(linkedlist);
        
        for (String list : linkedlist)
            System.out.print(list + " ");
        
        linkedlist.remove("January");
        System.out.println("LinkedList after removing elements: " +linkedlist);
        linkedlist.remove(3);
        System.out.println("LinkedList after removing elements: " +linkedlist);
        linkedlist.removeFirst();
        System.out.println("LinkedList after removing elements: " +linkedlist);
        linkedlist.removeLast();
 
        System.out.println("LinkedList after removing elements: " +linkedlist);
        
        linkedlist.clear();
        System.out.println("Clears all the list " +linkedlist);

	}

}
