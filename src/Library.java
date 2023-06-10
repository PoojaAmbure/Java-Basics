import java.util.*;
class Lib1 {
    String[] books;
    int num_of_books = 0;

    public Lib1() {
        this.books = new String[ 100 ];
    }

    public void addBooks(String book) {
        this.books[ num_of_books ] = book;
        num_of_books++;
        System.out.println(book + " has been added");
    }

    void showAvailBooks() {
        System.out.println();
        System.out.println("Available Books are = ");
        for ( String book : this.books ) {
            if (book == null) continue;
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        //for ( String b:this.books ) {
        for ( int i = 0 ; i < this.books.length ; i++ ) {
            if (this.books[ i ].equals(book)) {
                System.out.println("The book has been issued ");
                this.books[ i ] = null;
                return;
            }
        }
        System.out.println("This book does not exist..");
        }
        void returnBook() {
       //     addBooks(book);
        }
}

public class Library {

    public static void main(String[] args) {
        Lib1 lib = new Lib1();
        lib.addBooks("Bhagwat Geeta");
        lib.addBooks("Java");
        lib.addBooks("C++");
        lib.addBooks("php");

        lib.issueBook("Java");
        lib.showAvailBooks();
        //lib.returnBook("Java");
    }
}