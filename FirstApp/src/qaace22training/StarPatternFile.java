package qaace22training;
import java.io.*;

public class StarPatternFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        try {

            FileWriter filename = new FileWriter("/Users/pavithra.kumar/Documents/File Example/starprinting.txt");

            PrintWriter starprint = new PrintWriter(filename);

            int i, j,n=4;

            for(i=0; i<n; i++)

            {

                for(j=0; j<=i; j++)

                {

                	starprint.print("* ");

                }

                starprint.println();

            }

            System.out.println("File written successfully.");

            starprint.close();

        }

        catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }
	}

}
