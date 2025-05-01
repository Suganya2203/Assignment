package selfLearn;

public class Library {

	public static void main(String[] args) 
	{
		
		addBook("Chetan Bhagat");
		issueBook("Chetan Bhagat");

	}
		static String addBook(String bookTitle)
	{
		System.out.println(bookTitle+ " Book added successfully");
		return bookTitle;
	}
	static String issueBook (String newBook)
	{
		System.out.println(newBook+ " issued successfully");
		return newBook;
	}
	

	
}
