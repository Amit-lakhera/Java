package College ;

import java.util.Scanner;

public class book {
    public int sNo ;
    public String bookName ;
    public String authorName ;
    public int bookQty ;
    public int bookQtyCopy ;

    Scanner input = new Scanner(System.in) ;

    public book() {
        System.out.println("Enter Serial number of the book:");
        this.sNo = input.nextInt() ;
        input.nextLine() ;

        System.out.println("Enter the name of the book:");
        this.bookName = input.nextLine() ;

        System.out.println("Enter the name of the author:");
        this.authorName = input.nextLine() ;

        System.out.println("Enter the quantity of the book:");
        this.bookQty = input.nextInt() ;
        bookQtyCopy = this.bookQty ;
    }
}
