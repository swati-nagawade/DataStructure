package Datastructure;

public class PrimeNo {

	public static void main(String[] args) {
		int number = 29;
		boolean flag = false;
		for (int i = 2;i <= number/2; ++i) {
			//condition for Non prime number
			if(number % i == 0) {
				flag = true;
				break;
			   }
	    }

	    if (!flag)
	      System.out.println(number + " is a prime number.");
	    else
	      System.out.println(number + " is not a prime number.");
	}

}
