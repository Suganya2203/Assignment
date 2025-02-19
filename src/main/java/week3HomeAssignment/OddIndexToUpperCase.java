package week3HomeAssignment;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] tst1= test.toCharArray();
		System.out.println(tst1);
		int length =tst1.length;
		
		for(int i=0;i<length;i++)
			{
			 char new1= test.charAt(i);
			if(i%2!=0)
			{
				String test1= Character.toString(new1);
				
				System.out.print(test1.toUpperCase());
				
			}
			else
			{
				System.out.print(new1);
			}
			
		}

	}

}
