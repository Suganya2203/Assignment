package week4HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) 
	{
		
		
		List<Integer> listOfArray=new ArrayList<Integer>();
		listOfArray.add(3);
		listOfArray.add(2);
		listOfArray.add(11);
		listOfArray.add(4);
		listOfArray.add(6);
		listOfArray.add(7);
		
		System.out.println(listOfArray);
		int sizeOfArray = listOfArray.size();
		System.out.println(sizeOfArray);
		Collections.sort(listOfArray);
		System.out.println(listOfArray);
		
		int indexOfSecondLargest=sizeOfArray-2;    //0 1 2 3 4 5 
		System.out.println(indexOfSecondLargest);//2 3 4 6 7 11
	System.out.println(listOfArray.get(indexOfSecondLargest));
		
		
//		int x = (int)ArrayList.get(listOfArray[indexOfSecondLargest]); 
		
		//int secondLargest=listOfArray[indexOfSecondLargest];
		
	}

}
