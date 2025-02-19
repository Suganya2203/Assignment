package week3HomeAssignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String str1="stops";
		String str2="potss";
		
		if(str1.length()==str2.length())
		{
			
			char[] s1=str1.toCharArray();
			System.out.println(s1);
			char[] s2=str2.toCharArray();
			System.out.println(s2);
			Arrays.sort(s1);
			System.out.println(s1);
			Arrays.sort(s2);
			System.out.println(s2);
			boolean s=Arrays.equals(s1, s2);
			if(s)
			{
			System.out.println("The given strings are Anagram");
			}
			else
			{
				
			System.out.println("Not an anagram");
			}
			
		}
		
		else
		{
			System.out.println("Length Mismatch. Hence it is not an Anagram");
		}

	}

}
