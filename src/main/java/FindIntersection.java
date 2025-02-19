	package week4HomeAssignment;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) 
	{
		int [] a={3, 2, 11, 4, 6, 7};
		int []b= {1, 2, 8, 4, 9, 7};
		
		int lengthOfA=a.length;
		
		int lengthOfB=b.length;
		System.out.println("Printing length of a : "+lengthOfA);
		System.out.println("Printing length of b : "+lengthOfB);
		
		
		Arrays.sort(a);//2,3,4,6,7,11
		
		Arrays.sort(b);//1,2,4,7,8,9
		
		//System.out.println("Sorted Array of a : "+a);
		//System.out.println("Sorted Array of b : "+b);
		
	for(int i=0;i<lengthOfA; i++)
	{
		for(int j=0;j<lengthOfB;j++)
		{
			if (a[i]==b[j])
			{
				int matchingElelments=a[i];
				System.out.println(matchingElelments);
			}
		}
	}
	}

}
