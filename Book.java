public class Book
{
	public String displayInfo(String libraryName,String title,String author)
	{
		return "Library Name :"+libraryName+"\nBook Title :"+title+"\nBook Author"+author;
	}
	public static void main(String args[])
	{
		Book book=new Book();
		String info1=book.displayInfo("City Public Library","The Great Gatsby","F. ScottFitzerland");
		System.out.println(info1);
		System.out.println("------------------------------------------");
		String info2=book.displayInfo("City Public Library","1984","George Orwell");
		System.out.println(info2);
		System.out.println("------------------------------------------");

	}
}