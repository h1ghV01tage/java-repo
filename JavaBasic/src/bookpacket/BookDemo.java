package bookpacket;

//import bookpack.Book;

//BookDemo is also a a part of bookpack
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bookpack.Book [] books = new bookpack.Book [5];
		
		books[0] = new bookpack.Book("Java", "Grishav", 2023);
		books[1] = new bookpack.Book("C#", "John", 2022);
		books[2] = new bookpack.Book("Javascript", "Doe", 2021);
		books[3] = new bookpack.Book("React", "James", 2020);
		books[4] = new bookpack.Book("Angular", "Bond", 2019);
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
	}

}
