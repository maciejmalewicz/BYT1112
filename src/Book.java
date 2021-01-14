public class Book {

    private Long bookId;
    private String ISBN;
    private String name;
    private Byte[] image;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Review review;
    private BookDescription description;
    private Note note;
    private User user;
    private Owner owner;




    public void AddNote(String note){

    }
    public void AddReview(String note){

    }
    public void AddPhoto(){

    }
    public void SetChallenge(){

    }
    public void BarrowBookToSB(){

    }

}
