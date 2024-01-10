package College;

import java.util.Scanner;

public class books {
    book myBook[] = new book[100] ;
    public static int count ;

    Scanner input = new Scanner(System.in) ;

    // To compare books
    public int compareBookObjects(book b1 , book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book of this name already exists.");
            return 0 ;
        }
        if (b1.sNo == b2.sNo) {
            System.out.println("Book of this serial number already exists.");
            return 0 ;
        }
        return 1 ;
    }
    // To add books
    public void addBook(book b) {
        for (int i = 0; i < count ; i++) {
            if (this.compareBookObjects(b , this.myBook[i]) == 0) {
                return ;
            }
        }
        if (count < 100) {
            myBook[count] = b ;
            count++ ;
        } else {
            System.out.println("Not enough space to add books.");
        }
    }
    // To search book by its serial number
    public void searchBySno() {
        System.out.println("\t\t\t\tSEARCHING BY SERIAL NUMBER\n");

        int sNO ;
        System.out.println("Enter Serial Number of book:");
        sNO = input.nextInt() ;

        int flag = 0 ;
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty"
        );
        for (int i = 0; i < count; i++) {
            if (sNO == myBook[i].sNo) {
                System.out.println(
                    myBook[i].sNo + "\t\t"
                    + myBook[i].bookName + "\t\t"
                    + myBook[i].authorName + "\t\t"
                    + myBook[i].bookQty + "\t\t"
                    + myBook[i].bookQtyCopy
                );
                flag++ ;
                return ;
            }
        }
        if (flag == 0) {
            System.out.println("No book for Serial Number " + sNO + " found!!");
        }
    }
    // To search book by its Author's name
    public void searchByAuthorName() {
        System.out.println("\t\t\t\tSEARCHING BY AUTHOR'S NAME\n");
        input.nextLine() ;

        System.out.println("Enter the name of the author:");
        String authorName = input.nextLine();

        int flag = 0 ;

        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty"
        );

        for (int i = 0; i < count; i++) {
            if(authorName.equalsIgnoreCase(myBook[i].authorName)){
                System.out.println(
                    myBook[i].sNo + "\t\t"
                    + myBook[i].bookName + "\t\t"
                    + myBook[i].authorName + "\t\t"
                    + myBook[i].bookQty + "\t\t"
                    + myBook[i].bookQtyCopy
                );
                flag++ ;
            }
        }
        if (flag == 0) {
            System.out.println("No Books of " + authorName + " found of!!");
        }
    }
    // To show all books
    public void showAllBooks() {
        System.out.println("\t\t\t\tSHOWING ALL THE BOOKS\n");
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty"
        );
        for (int i = 0; i < count; i++) {
                System.out.println(
                    myBook[i].sNo + "\t\t"
                    + myBook[i].bookName + "\t\t"
                    + myBook[i].authorName + "\t\t"
                    + myBook[i].bookQty + "\t\t"
                    + myBook[i].bookQtyCopy
                );

        }
    }
    // To edit the book
    public void upgradeBookQty() {
        System.out.println("\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial Number of a book:");
        int sNO = input.nextInt() ;

        for (int i = 0; i < count; i++) {
            if (sNO == myBook[i].sNo) {
                System.out.println("Enter number of books to be added:");
                int addingBookQty = input.nextInt() ;

                myBook[i].bookQty += addingBookQty ;
                myBook[i].bookQtyCopy += addingBookQty ;

                return ;
            }
        }

    }
    // To create menu
    public void dispMenu() {
        System.out.println(
            "................................................................");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show all Books.");
        System.out.println("Press 5 to Register a Student.");
        System.out.println("Press 6 to Show all Registered Students.");
        System.out.println("Press 7 to Check Out Book.");
        System.out.println("Press 8 to Check in Book. ");
        System.out.println(
            "................................................................");
    }
    // To search the library
    public int isAvailable(int sNo) {
        for (int i = 0; i < count; i++) {
            if (sNo == myBook[i].sNo) {
                if (myBook[i].bookQtyCopy > 0) {
                    System.out.println("Book is Available.");
                    return i ;
                }
                System.out.println("Book is Unavailable.");
                return -1 ;
            }
        }
       System.out.println("No Book of this Serial Number " + sNo + " is Available");
       return -1 ;
    }
    // To remove the book from the library
    public book checkOutBook() {
        System.out.println("Enter Serial Number of Book to be Checked Out.");
        int sNO = input.nextInt();
        int bookIndex = isAvailable(sNO) ;
        if (bookIndex != -1) {
            myBook[bookIndex].bookQtyCopy-- ;
            return myBook[bookIndex] ;
        }
        return null ;
    }
    public void checkInBook(book b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(myBook[i])) {
                myBook[i].bookQtyCopy++ ;
                return ;
            }
        }
    }
}
