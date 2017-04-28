package oop.encapsulation;

public class FavoriteBooks {

	public static void main(String[] args) {
		Books FaveBook=new Books();
		FaveBook.setTitle("Leaves of Grass");
		FaveBook.setAuthor("Walt Whitman");
		FaveBook.setGenre("Poetry");
		FaveBook.setRating(9);
		System.out.println(FaveBook.getTitle()+", "+ FaveBook.getAuthor()+", " + FaveBook.getGenre() + ", "+ FaveBook.getRating());
		
		Books Fave2=new Books("Orlando", "Virginia Woolf", "Fiction", 8);
		System.out.println(Fave2.getTitle()+", "+Fave2.getAuthor()+", "+Fave2.getGenre()+", "+Fave2.getRating());
	}

}
