package week3HomeAssignment;

import java.util.Iterator;

public class PrintingOddWordsInUppercase 
{

	public static void main(String[] args) 
	{
		
		
		//Expected output="I ma a erawtfos tester"
		
		//*pseudo code
		//*Get the string
		//*get the length of the string
		//*store each word in an index
		//*first iterate so that all the values will be printed automatically
		//*inside for if should be given
		//*reverse if the index is odd
		//*print all the index of the strings
		
		String newString="I am a software tester";
		int lengthOfString=newString.length();
		String result = ""; 
		String [] newWord= newString.split(" ");
		
		System.out.println(lengthOfString);
		int lengthOfArray= newWord.length;
				//System.out.println(newWord[3]);
		
		for(int i=0;i<lengthOfArray; i++)
		{ 
			System.out.println(newWord[i]+ " **Printing i**");
			
			if(newWord/2=0)
//			
			{
				System.out.println(newWord[]+ "**Printing j**");
			}
				System.out.print(newWord[lengthOfString-1]+ "*****Printing i*****");
				
			}
			else
			{
				System.out.print(newWord[i]+ " ");
			}
		
		}
		

	}

}
