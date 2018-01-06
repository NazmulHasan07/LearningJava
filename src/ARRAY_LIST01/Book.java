//******************************************************
// Book.java   Author: Nazmul Hasan
// Demonstrates how to add new array for an array list.
//******************************************************

package ARRAY_LIST01;
import java.util.*;  
class BookInfo {  
	int refId;  
	String title,author,publisher;  
	int pages;  
	public BookInfo(int refId, String title, String author, String publisher, int pages) {  
		this.refId = refId;  
		this.title = title;  
		this.author = author;  
		this.publisher = publisher;  
		this.pages = pages;  
	}  
}  
public class Book {  
	public static void main(String[] args) {  
		//Creating a list of Books Info  
		List<BookInfo> list=new ArrayList<BookInfo>();  
		//Creating Books info with additional info 
		BookInfo b1=new BookInfo(1056,  "Secrtes of the Lost Summer","        Carla Neggers","   Harlequin                    ",400);  
		BookInfo b2=new BookInfo(9310,  "A Son of the Circus","               John Irving","     Ballantine Books             ",682);  
		BookInfo b3=new BookInfo(7703,  "A Window for One Year","             John Irving","     Random House Publishing Group",576);
		BookInfo b4=new BookInfo(2489,  "Windows 2000 Systems Programming","  Al Williams","     Coriolis Group Books         ",615);
		//Adding Books to array list  
		list.add(b1);  
		list.add(b2);  
		list.add(b3);
		list.add(b4);  


		System.out.println("RefId" + "    BookTitle" + "                              AuthorName" +"           Publisher"+"                          NumOfPages"); 
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------"); 
		System.out.println();
		//Find out how to do Traversing list  
		for(BookInfo b:list){  
			System.out.println(b.refId+"     "+b.title+"     "+b.author+"     "+b.publisher+"       "+b.pages);  
		}  
	}  
}  
