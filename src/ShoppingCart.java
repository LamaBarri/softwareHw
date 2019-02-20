import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Book> collection_of_book ;

	public ShoppingCart() {
     collection_of_book = new ArrayList<Book>();
	}
 
 public int getCount() {
 
		return collection_of_book.size();
}

 

public int totalprice() {
	int totprice=0;
	for (int i=0; i<collection_of_book.size();i++) {
		totprice += collection_of_book.get(i).Price;	
	}
	return totprice;

 

}

public void addBook(Book book) {
	collection_of_book.add(book);
	
}
}
