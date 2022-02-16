package qaace22training;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String str[] = {"Vijay", "Ajith", "Raksha", "Swathi", "Varsha"};

    System.out.println("original string array is: "+ Arrays.toString(str));

    System.out.println("copied array is: " + Arrays.toString(Arrays.copyOf(str, 5)));

    System.out.println("copied range of array is: "+ Arrays.toString(Arrays.copyOfRange(str,0,2)));

    System.out.println("the array is converted to list is:" + Arrays.asList(str) );
    
    Arrays.sort(str);

    System.out.println("Sorted Array:" + Arrays.toString(str));

    Arrays.fill(str,"Sirius");
    
    System.out.println("array after call to fill is:" + Arrays.toString(str));
    
	}

}
