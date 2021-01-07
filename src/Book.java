public class Book {

    private int BookId;
    private int ISBN;
    private String name;
    private String image;

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
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
