package College;

import java.util.Scanner;

public class students {
    Scanner input = new Scanner(System.in);
    student theStudents[] = new student[100];
    public static int count = 0;

    // To add students
    public void addStudent(student s) {
        for (int i = 0; i < count; i++) {
            if (s.regNumber.equalsIgnoreCase(theStudents[i].regNumber)) {
                System.out.println("Student of Registration Number " + s.regNumber + " is alredy registered.");
                return;
            }
        }
        if (count <= 100) {
            theStudents[count] = s;
            count++;
        }
    }

    // Displaying all the students
    public void displayStudent() {
        System.out.println("Student Name\tReg Num");
        for (int i = 0; i < count; i++) {
            System.out.println(theStudents[i].studentName + "\t\t" + theStudents[i].regNumber);
        }
    }

    // To check stsudent
    public int isStudent() {
        System.out.println("Enter Registration Number:");
        String regNumber = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (theStudents[i].regNumber.equalsIgnoreCase(regNumber)) {
                return i;
            }
        }
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered first.");
        return -1;
    }

    // To remove the book
    public void checkOutBook(books book) {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {
            System.out.println("checking out");

            book.showAllBooks();
            book b = book.checkOutBook();

            System.out.println("checking out");
            if (b != null) {
                if (theStudents[studentIndex].booksCount <= 3) {
                    System.out.println("adding book");
                    theStudents[studentIndex].borrowedBooks[theStudents[studentIndex].booksCount] = b;
                    theStudents[studentIndex].booksCount++;

                    return;
                } else {
                    System.out.println("Student can't borrow more than 3 books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }

    // To add the book
    public void checkInBook(books book) {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {
            System.out.println(
                    "S.No\t\t\tBook Name\t\t\tAuthor Name");

            student s = theStudents[studentIndex];

            for (int i = 0; i < s.booksCount; i++) {
                System.out.println(
                        s.borrowedBooks[i].sNo + "\t\t\t"
                                + s.borrowedBooks[i].bookName + "\t\t\t"
                                + s.borrowedBooks[i].authorName);
            }
            // Display Message only
            System.out.println("Enter Serial Number of Books to be Checked In");
            int sNo = input.nextInt();
            for (int i = 0; i < s.booksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;

                    return;
                }
            }
            System.out.println("Book of this Serial Number " + sNo + " not found");
        }
    }
}
