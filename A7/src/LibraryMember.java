public class LibraryMember {
    private String name;
    private String memberId;
    private Book borrowedBook;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void borrowBook(Book book) {
        if (borrowedBook != null) {
            System.out.println("You already have a book: " + borrowedBook.getTitle());
        } else if (book.isBorrowed()) {
            System.out.println("'" + book.getTitle() + "' is currently unavailable.");
        } else {
            borrowedBook = book;
            book.setBorrowed(true);
            System.out.println(name + " borrowed '" + book.getTitle() + "'.");
        }
    }

    public void returnBook() {
        if (borrowedBook == null) {
            System.out.println("No book to return.");
        } else {
            borrowedBook.setBorrowed(false);
            System.out.println(name + " returned '" + borrowedBook.getTitle() + "'.");
            borrowedBook = null;
        }
    }

    public void displayStatus() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");

        if (borrowedBook == null) {
            System.out.println("Current Book: None");
        } else {
            System.out.println("Current Book: Title: " + borrowedBook.getTitle()
                    + ", Author: " + borrowedBook.getAuthor()
                    + ", ISBN: " + borrowedBook.getIsbn());
        }
    }
}