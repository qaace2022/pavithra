package qaace22training;

public class CountInstance {
	
	private static int count;

    public CountInstance()   
    {
       count++;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountInstance instance1 = new CountInstance();

		CountInstance instance2 = new CountInstance();

		CountInstance instance3 = new CountInstance();

		CountInstance instance4 = new CountInstance();

		CountInstance instance5 = new CountInstance();

		CountInstance instance6 = new CountInstance();

		CountInstance instance7 = new CountInstance();

		CountInstance instance8 = new CountInstance();

		CountInstance instance9 = new CountInstance();

        System.out.print("Total Number of Objects: " + CountInstance.count);

	}

}
