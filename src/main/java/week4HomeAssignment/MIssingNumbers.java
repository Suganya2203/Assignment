package week4HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MIssingNumbers {

	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(10);
		a.add(6);
		a.add(8);
		
		
		Collections.sort(a);
		System.out.println(a);
		
		for(int i=1;i<10;i++)
		{
			if(a.equals(i))
			{
				System.out.println(a);
			}
			else
			{
				System.out.println("Missing values are: "+i);
			}
		}
		
		
	}

}
