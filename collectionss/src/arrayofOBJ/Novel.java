package arrayofOBJ;

public class Novel {

	int id;
	String author;
	String title;
	int price;
	int pages;

	Novel(int id, String author, String title, int price, int pages) {

		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.pages = pages;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Novel [id=" + id + ", author=" + author + ", title=" + title + ", price=" + price + ", pages=" + pages
				+ "]";
	}

}
