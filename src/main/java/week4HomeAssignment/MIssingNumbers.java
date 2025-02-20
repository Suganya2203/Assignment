package week4HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MIssingNumbers {

	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(10);
		list.add(6);
		list.add(8);
		
		
		Collections.sort(list);//1,2,3,4,6,8,10
		System.out.println(list);
		
		
		int num=1;
		
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(num);
			if(list.get(i)!=num)
			{
				System.out.println("Missing Number is :"+num);
				i--;
				num++;
				
			}
			else
			{
				System.out.println("values which are presernt are: "+num);
				num++;
				

			}
		}
		
		
	}

}
