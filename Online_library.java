class Library {
    String[] books;
    int noOfBooks;

    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    public void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added!");
    }

    public void showAvailablebooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The  book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This  book does not exist!");
    }

    public void returnBook(String book) {
        addBook(book);
    }
}

public class Online_library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("JAVA");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("C");
        centralLibrary.addBook("Data Structures");

        centralLibrary.showAvailablebooks();
        centralLibrary.issueBook("C");
        centralLibrary.showAvailablebooks();
        centralLibrary.returnBook("C");
        centralLibrary.showAvailablebooks();
    }
}
