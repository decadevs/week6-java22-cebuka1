package library.service.impl;

import library.model.Book;
import library.model.Borrower;
import library.model.BorrowerComparator;
import library.model.Library;
import library.service.Libary.LibraryService;

import java.util.LinkedList;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

public class LibraryServiceImpl implements LibraryService {

    PriorityQueue<Borrower> borroweronQueue;
    Queue<Borrower> borrowerQueue;

    public LibraryServiceImpl(){
        borroweronQueue = new PriorityQueue<>(new BorrowerComparator());
        borrowerQueue = new LinkedList<>();
    }
    @Override
    public void addBorrowerToQueue(Borrower borrower) {
        borrowerQueue.add(borrower);

    }

    @Override
    public String borrowBooks(Library library, Book book) {
        return Optional.ofNullable(borroweronQueue.poll())
                .map(borrower -> {
                 if (book.getBookQuantity() > 0){
                     book.setBookQuantity(book.getBookQuantity() - 1);
                     return borrower.getFullName() + " has borrowed " + book.getTitle();
                 }else {
                     return "Book Taken";
                 }
                })
                .orElse("No borrower is on Queue");
    }

    @Override
    public void addToQueueOnFirstCome(Borrower borrower) {
        borrowerQueue.add(borrower);
    }

    @Override
    public String getBookFirstOnFirstCome(Book book) {
        return Optional.ofNullable(borrowerQueue.poll())
                .map(borrower -> {
                    if (book.getBookQuantity() > 0){
                        book.setBookQuantity(book.getBookQuantity() - 1);
                        return borrower.getFullName() + " has borrowed " + book.getTitle();
                    } else{
                        return "Book Taken";
                    }
                })
                .orElse("No Borrower is on the queue");
    }
}
