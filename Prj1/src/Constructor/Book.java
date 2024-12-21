package Constructor;

public class Book {
	private String title;
	private String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	void disp() {
		System.out.println(title+" "+author);
	}

	public static void main(String[] arg)
	{
		Book inst=new Book("Title","Roman");
		inst.disp();
	}
}
