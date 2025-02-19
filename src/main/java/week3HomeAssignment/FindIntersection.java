package week3HomeAssignment;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {

		int [] a= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		Arrays.sort(a);//2,3,4,6,7,11
		Arrays.sort(b);//1,2,4,7,8,9
		
		int lengthOfArrayA= a.length;
		int lengthOfArrayB=b.length;
		
		System.out.println("Length of array A is "+lengthOfArrayA);
		System.out.println("Length of array A is "+lengthOfArrayB);
		
		for (int i=0;i<lengthOfArrayA;i++)
		{
			for (int j=0;j<lengthOfArrayB;j++)
			{
			System.out.println(a);
		}}

	}

}
