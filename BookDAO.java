kage com.FrameWorkProject.ManageData;

import java.util.Scanner;
import java.util.TreeSet;
import com.FrameWorkProject.Book;
import com.FrameWorkProject.PopularityComparator;

public class BookDAO {
	Scanner sc=new Scanner(System.in);
	TreeSet<Book> t=new TreeSet<Book>(new PopularityComparator());
	public void addBook(Book book) {
		t.add(book);
		System.out.println("Book Added Successfully");	
	}
		public void updateBookRating(String isbn) {
			if(t.size( )==0) {
			System.out.println("There is no Books To Update Rating");
				
			}else {
			boolean flag=false;
			Book found=null;
			for(Book b:t) {
				if(b.getIsbn().equals(isbn)) {
					flag =true;
					found=b;
					break;
				}
			}
			
				if(flag==true) {
					t.remove(found);
					System.out.println("Enter updated Rating:");
					System.out.println("Rating must be in the range of 0-10");
					double rating =sc.nextDouble( );
					sc.nextLine(); 
					found.setRating(rating);
					t.add(found);
					System.out.println("The Book Rating is Updated Successfully");
				}
				else {
					System.out.println("Book Not Found");
				}
			}
		}
			public void getAllBooks() {
				if(t.size( )==0) {
					System.out.println("Empty Library");
					
				}else {
					System.out.println("List of the Books in the Library are");
				
					for(Book p:t) 
						System.out.println(p);
				}
			}
			public Book topRated( ) {
				if(t.size( )==0) 
					return null;
				
				 return t.first( );
			}
		
	}