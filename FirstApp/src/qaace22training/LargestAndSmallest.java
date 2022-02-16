package qaace22training;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[]{86,94,2,44,65,34,52,10,40};

        //assign first element of an array to largest and smallest
		
        int small = numbers[0];

        int large = numbers[0];

        for (int i = 0; i < numbers.length; i++) 
        {

           if (numbers[i] > large)

              large = numbers[i];

           else if (numbers[i] < small)

              small = numbers[i];

        }

        System.out.println("Largest Number is : " + large);

        System.out.println("Smallest Number is : " + small);

	}

}
