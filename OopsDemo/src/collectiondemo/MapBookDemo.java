package collectiondemo;

import java.util.*;
import java.util.Map.Entry;

import miscellaneous.Book;

public class MapBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,Book> bookmap=new TreeMap<Integer,Book>();
       
       
     //create Books
     		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
     	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
     	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);   
     	    
     	    // add Books to map
     	    bookmap.put(3, b3);
     	    bookmap.put(1, b1);
     	    bookmap.put(2, b2);
     	    
     	    //Traversing in Map
     	    for(Entry<Integer,Book> e:bookmap.entrySet())
     	    {
     	    	int key=e.getKey();
     	    	Book b=e.getValue();
     	    	System.out.println("Book :"+key+" Details: ");
     	    	System.out.println(b.getId()+ " "+b.getName()+" "+b.getAuthor()+
     	    			" "+b.getPublisher()+" "+b.getQuantity());
     	    }
       
	}

}
