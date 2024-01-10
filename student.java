package College ;

import java.util.Scanner;

public class student{
    String studentName ;
    String regNumber ;

    book borrowedBooks[] = new book[3] ;
    public int booksCount = 0 ;

    Scanner input = new Scanner(System.in) ;

    public student(){
        System.out.println("Enter the Student Name :");
        this.studentName = input.nextLine() ;

        System.out.println("Enter the Registration Number :");
        this.regNumber = input.nextLine() ;
    }
}
