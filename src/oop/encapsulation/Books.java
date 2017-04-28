package oop.encapsulation;

public class Books {
	private String title;
	private String author;
	private String genre;
	private int rating;
	
	public Books(){
	}
	public Books(String title, String author, String genre, int rating) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
