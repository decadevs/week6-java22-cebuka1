package library.service;

import library.enums.Role;
import library.model.Book;
import library.model.Borrower;
import library.model.Library;
import library.service.Libary.LibraryService;
import library.service.impl.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryServiceImpl();

        //Creating New Instance of Book
        Book book = new Book(02, "Fight Corruption In Nigeria is Dangerous", "Ngozi Okonjo-Iwela",3);
        Book book2 = new Book(03, "Who killed Dele Giwa", "Richard Akinnola",2);
        Library library = new Library(book);
        Library library1 = new Library(book2);


        //with priority
        libraryService.addBorrowerToQueue(new Borrower("AGBO SUNDAY", Role.SENIOR_STUDENT));
        libraryService.addBorrowerToQueue(new Borrower("ELIAS AGBO", Role.JUNIOR_STUDENT));
        libraryService.addBorrowerToQueue(new Borrower("AGBO THANKGOD", Role.TEACHER));


        //without priority
        libraryService.addToQueueOnFirstCome(new Borrower("UCHE AGBO", Role.TEACHER));
        libraryService.addToQueueOnFirstCome(new Borrower("CHIBUZOR AGBO", Role.SENIOR_STUDENT));
        libraryService.addToQueueOnFirstCome(new Borrower("CHINEDU AGBO", Role.JUNIOR_STUDENT));

        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*__*_*__*__*_*-");


        System.out.println(libraryService.getBookFirstOnFirstCome(book2));
        System.out.println(libraryService.getBookFirstOnFirstCome(book2));
        System.out.println(libraryService.getBookFirstOnFirstCome(book2));
        System.out.println("*_*_*_*_*_*_*__**_*_*_*_*_*_*_*_*_*_*_*_*_**_");

        //with Priority
        //LibraryServiceImpl libraryService = new LibraryServiceImpl();


        //without priority
//        LibraryServiceImpl2 libraryServiceImpl2 = new LibraryServiceImpl2();

        //Adding Borrower To Queue With Priority
//        libraryService.addBorrowerToQueue(new Borrower("Agbo Sunday", Role.JUNIOR_STUDENT));
//        libraryService.addBorrowerToQueue(new Borrower("John Agene", Role.SENIOR_STUDENT));
//        libraryService.addBorrowerToQueue(new Borrower("Uchenna Obi", Role.TEACHER));
//
//        //Adding Borrower With Priority
//        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("Mike Owen", Role.SENIOR_STUDENT));
//        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("Osiki Segun", Role.TEACHER));
//        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("Chukwudi Obiora", Role.JUNIOR_STUDENT));
//
//        System.out.println("This is with Priority");
//        System.out.println(libraryService.borrowBooks(library, book));
//        System.out.println(libraryService.borrowBooks(library, book));
//        System.out.println(libraryService.borrowBooks(library, book));
//        System.out.println("****************************************");
//
//        System.out.println("This is on a first come serve basis");
//        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
//        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
//        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
//        System.out.println("*********************************************");
    }
}