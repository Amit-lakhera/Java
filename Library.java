package College;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("*******************************Welcome to Amit's Library**********************************");
        System.out.println("                              Select from the following options:                          ");
        System.out.println("******************************************************************************************");

        // creating object of books class
        books ob = new books();
        //creating object of students class
        students obstudents = new students() ;

        int choice ;
        int searchChoice ;

        do {
            ob.dispMenu();
            choice = input.nextInt() ;

            //switch case
            switch (choice) {
                case 1:
                    book b = new book() ;
                    ob.addBook(b);
                    break;

                case 2:
                    ob.upgradeBookQty();
                    break ;

                case 3:
                    System.out.println("Press 1 to Search with Book Serial No.");
                    System.out.println("Press 2 to Search with Book's Author's Name.");
                    searchChoice = input.nextInt() ;

                    //nested switch case
                    switch (searchChoice) {
                        case 1:
                            ob.searchBySno();
                            break;
                        case 2:
                            ob.searchByAuthorName();
                    }
                    break ;

                case 4:
                    ob.showAllBooks();
                    break ;

                case 5:
                    student s = new student() ;
                    obstudents.addStudent(s);
                    break ;

                case 6:
                    obstudents.displayStudent();
                    break ;

                case 7:
                    obstudents.checkOutBook(ob);
                    break ;

                case 8:
                    obstudents.checkInBook(ob);
                    break ;

                default:
                    System.out.println("ENTER BETWEEN 0 TO 8.");
            }
        } while (choice != 0);
    }
}
