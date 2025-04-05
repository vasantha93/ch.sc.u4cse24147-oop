class Book {
    private String title;
    private String author;
    private String ISBN;
    private int availableCopies;

    public Book(String title, String author, String ISBN, int availableCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Book returned successfully.");
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "123456", 3);

        System.out.println("Book: " + book1.getTitle() + " | Available Copies: " + book1.getAvailableCopies());
        
        book1.borrowBook();
        System.out.println("After borrowing, Available Copies: " + book1.getAvailableCopies());
        
        book1.returnBook();
        System.out.println("After returning, Available Copies: " + book1.getAvailableCopies());
    }
}
