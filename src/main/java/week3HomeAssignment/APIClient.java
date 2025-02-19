package week3HomeAssignment;

public class APIClient 
{
	public String sendRequest(String a)
	{
		System.out.println("This is the first method");
		return a;
	}
	public String endPoint(String b)
	{
		System.out.println("Printing endpoint");
		return b;
	}
	
	public String sendRequest(String a,String b,boolean c)
	{
		System.out.println(a + b+c + " This is Second method");
		return a+b+c;
	}


	public static void main(String[] args) 
{
		APIClient ac= new APIClient();
		ac.sendRequest("Hello");
		ac.endPoint("new");
		ac.sendRequest("test ", "new ", false);

	}
}