package ex04_api;

public class Book {
	String bookName;
	String name;
	
	public Book (String bookName, String name) {
		this.bookName = bookName;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = "책 제목 : " + this.bookName + ", 저자 : " + this.name;
		return str; 
	}
	
	public static void main(String[] args) {
		Book bk = new Book("자바의 정석","남궁성");
		System.out.println(bk);
	}
}
