package week4HomeAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollecting {

	public static void main(String[] args) 
	{
		List<String> names=new ArrayList<String>();
		names.add("HCL");
		names.add("Wipro");
		names.add("Aspire Systems");
		names.add("CTS");
		
		int n= names.size();
		System.out.println(n);
		Collections.sort(names);
		
		System.out.println(names);
		
		for(int i=n-1;i>=0;i--)
		//       i=3;3<4;2
			//	i=2;2<4
		{
			
			System.out.println(names.get(i));
		}
	
	}

}
