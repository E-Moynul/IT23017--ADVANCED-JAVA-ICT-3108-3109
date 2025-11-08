//it23017
class Book {

    String title;
    String author;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Library {
    public static void main(String[] args) {
        Book myBook = new Book(); 

        myBook.title = "The Hobbit";
        myBook.author = "J.R.R. Tolkien";

        System.out.println("--- My First Book ---");
        myBook.displayInfo();

        Book anotherBook = new Book();
        anotherBook.title = "1984";
        anotherBook.author = "George Orwell";

        System.out.println("\n--- My Second Book ---");
        anotherBook.displayInfo();
    }
}
