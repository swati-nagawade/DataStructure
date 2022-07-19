package Datastructure;

public class array_min {

	public static void main(String[] args) 
	{
		int[]a= {4,7,9,3,1,6,5};
		//Assume first element is minimum
		int min = a[0];
		for(int i=1 ; i<a.length; i++)
		{
			if(min > a[i]) //any value is less than min.which is replace by minimun value
			{
				min = a[i];
			}
		}
		System.out.println("minimum element is " + min);
	}
}
