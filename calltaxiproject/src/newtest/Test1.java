package newtest;

public class Test1 {

	int id;
	String author;
	String title;
	int price;
	int pages;

	Test1(int id, String author, String title, int price, int pages) {
		
		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.pages = pages;

	}

	@Override
	public String toString() {
		return "Test1 [id=" + id + ", author=" + author + ", title=" + title + ", price=" + price + ", pages=" + pages
				+ "]";
	}
	
	}
	
	
	
	
