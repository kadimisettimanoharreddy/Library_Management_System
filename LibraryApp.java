package com.FrameWorkProject.ServiceView;

import com.FrameWorkProject.Service.LibraryService;
import java.util.Scanner;

public class LibraryApp {
    LibraryService S1 = new LibraryService();
    static Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Enter Book Title:");
        String title = sc.next();
        System.out.println("Enter Author:");
        String author = sc.next();
        System.out.println("Enter ISBN:");
        String isbn = sc.next();
        double rating;
        System.out.println("Enter Rating (greater than 0 and less than 10):");
        rating = sc.nextDouble();
        sc.nextLine(); 

        
        if (rating > 0 && rating < 10) {
            S1.addBook(title, author, isbn, rating);
        } else {
            System.out.println("Invalid rating. Please enter a value greater than 0 and less than 10.");
        }
    }

    public void updateRating() {
        System.out.println("Enter ISBN:");
        String isbn = sc.next();
        S1.updateRating(isbn);
    }

    public void displayAll() {
        S1.displayAll();
    }

    public void displayTopRated() {
        S1.displayTopRated();
    }

    public static void main(String args[]) {
        LibraryApp L1 = new LibraryApp();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1: Add new Book");
            System.out.println("2: Update Book Rating");
            System.out.println("3: Display all Books");
            System.out.println("4: Display Top Rated Books");
            System.out.println("5: Exit");
            System.out.println("Enter your choice among these options:");
            int n = sc.nextInt();
            sc.nextLine(); 

            switch (n) {
                case 1:
                    L1.add();
                    break;
                case 2:
                    L1.updateRating();
                    break;
                case 3:
                    L1.displayAll();
                    break;
                case 4:
                    L1.displayTopRated();
                    break;
                case 5:
                    isExit = true;
                   System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}