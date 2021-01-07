public class Owner {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void recieveBorrowedBook() {
    }

    public void registerBook() {
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Owner(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    private int bookId;

    public Owner() {
    }


}
