public class Owner {
    public  int userId;
    public  int bookId;


    public Owner(int userId,int bookId) {
        this.userId = userId;
        this.bookId=bookId;
    }



    public int getUserId() {
        return userId;
    }

    public void recieveBorrowedBook() {

    }

    public double registerBook() {
        return 0;
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






}
