

import java.util.Date;

public class BookBorrowing {
    private Date dateLent;
    private Date dateBarrow;
    private User borrower;
    private Book book;

    public void checkDueDates(){

    }

    public Date getDateLent() {
        return dateLent;
    }

    public void setDateLent(Date dateLent) {
        this.dateLent = dateLent;
    }

    public Date getDateBarrow() {
        return dateBarrow;
    }

    public void setDateBarrow(Date dateBarrow) {
        this.dateBarrow = dateBarrow;
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
