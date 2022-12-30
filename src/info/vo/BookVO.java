package info.vo;
//책의 정보 (도서번호, 제목, 작가, 출판사, 가격, 카테고리)를 저장하는 클래스

public class BookVO {
	
	//멤버변수
	private int isbn;
	private String bookName;
	private String publish;
	private String author;
	private int price;
	private String category;
	
	//생성자
	public BookVO() {}
	
	public BookVO(int isbn, String bookName, String publish, String author, int price, String category) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.publish = publish;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	//getter / setter
	public  int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	//to String
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bookName=" + bookName + ", publish=" + publish + ", author=" + author
				+ ", price=" + price + ", category=" + category + "]";
	}

}
