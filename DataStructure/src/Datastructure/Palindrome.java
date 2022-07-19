package Datastructure;

public class Palindrome {

	public static void main(String[] args) {
		int num = 131;// select any one no.
		int temp = num;//for original no.is saved under temp
		int rev = 0,rem;//two variable rev and rem
		while(temp!=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num==rev) {
	System.out.println(num+ " num is palindrome");
   }
  else
  {
	System.out.println(num+ " num is not a palindrome");
	}
}



	}


