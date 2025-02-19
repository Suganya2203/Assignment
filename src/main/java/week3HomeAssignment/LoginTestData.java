package week3HomeAssignment;

import java.util.Base64;

public class LoginTestData implements BasePage
{
	
	void enterUsername()
	{
		System.out.println("Entering username in child class");
	}
	
	void enterPassword()
	{
		System.out.println("Entering password in child class");
	}

	public static void main(String[] args) {
		LoginTestData newObj= new LoginTestData();
		newObj.findElements(15);
		newObj.clickElement(76,98);
		newObj.enterText("new","update");
		newObj.performCommonTasks(655454.876,54,654.87f);
	}

	@Override
	public int findElements(int a) {
		a=10;
		System.out.println(a);
		return 0;
	}

	@Override
	public void clickElement(int a, int b) 
	{
		a=43;
		b=87;
		System.out.println(a+b);
		
	}

	@Override
	public void enterText(String s, String t) 
	{
		s="Happy";
		t="Learning";
		System.out.println(s+t);
		
	}

	@Override
	public void performCommonTasks(double d, int e, float g) {
		d=3498765.87;
		e=644;
		g=675654.76f;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		
	}

}
