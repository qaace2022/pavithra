package qaace22training;

class Addition{

    int c;

    Addition(int a,int b){

        c=a+b;

    }

}

class Subtraction{

    int c;

    Subtraction(int a,int b){

        c=a-b;

    }

}

class Multiplication{

    int c;

    Multiplication(int a,int b){

        c=a*b;

    }

}

class Division{

    int c;

    Division(int a,int b){

        c=a/b;

    }

}

public class CalculatorWithSeparateClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition(25,2);

        System.out.println("Addition = "+add.c);

        Subtraction sub = new Subtraction(25,2);

        System.out.println("Subtraction = "+sub.c);

        Multiplication mult = new Multiplication(25,2);

        System.out.println("Multiplication = "+mult.c);

        Division div = new Division(25,2);

        System.out.println("Division = "+div.c);

	}

}
