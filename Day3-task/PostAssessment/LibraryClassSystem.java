package PostAssessment;

public class LibraryClassSystem 
{

	    static String[] books = new String[5];
	    static int count = 0;

	    static void addBook(String book) 
	    {
	        if (count < books.length) books[count++] = book;
	        else System.out.println("Library full!");
	    }

	    static void removeBook(String book) 
	    {
	        for (int i = 0; i < count; i++) 
	        {
	            if (books[i].equals(book)) {
	                books[i] = books[count - 1];
	                books[--count] = null;
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	    }

	    static void issueBook(String book) 
	    {
	        for (int i = 0; i < count; i++) 
	        {
	            if (books[i].equals(book)) 
	            {
	                System.out.println("Book issued: " + book);
	                removeBook(book);
	                return;
	            }
	        }
	        System.out.println("Book not available!");
	    }

	    static void showBooks() 
	    {
	        System.out.println("Books in library:");
	        for (int i = 0; i < count; i++)
	            System.out.println("- " + books[i]);
	    }

	    public static void main(String[] args) 
	    {
	        addBook("Java");
	        addBook("Python");
	        addBook("C++");
	        showBooks();
	        issueBook("Python");
	        removeBook("C++");
	        showBooks();
	    }
	}

