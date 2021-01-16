

import java.util.Date;

public class BookBorrowing {
    private Date dateLent;
    private Date dateDue;

    //associations
    private User borrower;
    private Book book;

    public BookBorrowing(Date dateLent, Date dateDue, User borrower, Book book) {
        this.dateLent = dateLent;
        this.dateDue = dateDue;
        this.borrower = borrower;
        this.book = book;
    }

    public static void checkDueDates(){

    }

    public Date getDateLent() {
        return dateLent;
    }

    public void setDateLent(Date dateLent) {
        this.dateLent = dateLent;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
