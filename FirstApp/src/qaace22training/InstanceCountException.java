package qaace22training;

 
class MaxLimitReached extends Exception{

    public MaxLimitReached(String s) {

        super(s);

    }

}

public class InstanceCountException {
	
		private static int count = 0;

		static void instancelimit (int count) throws MaxLimitReached{    
		       if(count > 3){  
		 
		    	   //count++;
		    	throw new MaxLimitReached("More than three objects created");
		        // throw an object of user defined exception  
		            
		    }  
		       else { 
		    	   System.out.println("Instance created:");
		    	      
		        }   
		     }    

	    public InstanceCountException()
	    {	 
		    	   count++;
		        // throw an object of user defined exception  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			InstanceCountException instance1 = new InstanceCountException();
	
			InstanceCountException instance2 = new InstanceCountException();
	
			InstanceCountException instance3 = new InstanceCountException();
			
			InstanceCountException instance4 = new InstanceCountException();
			
			instancelimit(InstanceCountException.count);
	
			System.out.print("Total Number of Objects: " + InstanceCountException.count);
		}
		catch (MaxLimitReached e1) {
            
            System.out.println("Maximum limit reached \n"+ e1);
        }

	}

}
