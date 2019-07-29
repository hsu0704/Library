package cn.tedu.entity;

public class Three_Book {
	private int bookid ;
	private String bookcar ;
	private String bookname ;
	private String bookposition;
	public Three_Book(int bookid, String bookcar, String bookname, String bookposition) {
		this.bookid = bookid;
		this.bookcar = bookcar;
		this.bookname = bookname;
		this.bookposition = bookposition;
	}
	@Override
	public String toString() {
		return "Three_Book [bookid=" + bookid + ", bookcar=" + bookcar + ", bookname=" + bookname + ", bookposition="
				+ bookposition + "]";
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookcar() {
		return bookcar;
	}
	public void setBookcar(String bookcar) {
		this.bookcar = bookcar;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookposition() {
		return bookposition;
	}
	public void setBookposition(String bookposition) {
		this.bookposition = bookposition;
	}
	


}
