package Datastructure;

public class array_max {

	public static void main(String[] args) {

		int[] a = {4,7,2,8,5,6};
		
		int max =a[0];
		for(int i=1;i < a.length; i++)
		{
			if(max<a[i])	
			{
				max=a[i];
			}
		}
		System.out.println("Max element is "+max);
	}	
}




