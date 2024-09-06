package Dsa;

import java.util.ArrayList;
import java.util.Collections;

public class BookDriver 
{
	public static void main(String[] args) 
	{
		ArrayList<Book> al =new ArrayList();// downcast or else make generic.
		al.add(new Book("Harry potter",180,"JK rowlongs"));
		al.add(new Book("aava",120,"Dixit Sir"));
		al.add(new Book("python",700,"Anonymous"));
		Collections.sort(al);
	    System.out.println(al);
		
//		for(int i=0;i<al.size();i++) 
//		{
//		    Book book=al.get(i);
//		    if(book.price<200)
//		    {
//			System.out.println(al.get(i));
//		    }
//		}
		/* always use for loop for crud operations */
//		for(Book book:al) {
//					System.out.println(book);
//				    }
//			
	}
	
	}
	
	
	



