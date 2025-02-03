package week1HomeAssignment;

public class IsPrime1 
{

	public static void main(String[] args)
	{
			    int a = 13;  
			    
			    for (int i = 1; i <= a; i++) 
			    {
			      int b = 0; 

			      for (int j = 2; j <= i / 2; j++) 
			      {
			        if (i % j == 0) 
			        {
			          b++;  
			          break;  
			        }
			      }

			      if (b == 0) 
			      {
			        System.out.println(i+ " is a prime number");
			      }
			    }
	  }
}

