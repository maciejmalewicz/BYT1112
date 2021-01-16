import java.util.ArrayList;
import java.util.List;

public class Book {

    private Long bookId;
    private String ISBN;
    private String name;
    private byte[] image;

    //associations
    private List<Review> review = new ArrayList<>();
    private BookDescription description;
    private List<Note> note = new ArrayList<>();
    private Owner owner;

    public Book(Long bookId) {
        this.bookId = bookId;
    }

    public void addNote(String note, User user){

    }
    public void addReview(String review, User author){

    }
    public void addPhoto(byte[] photo){

    }
    public void borrowBookToSB(){

    }

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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public BookDescription getDescription() {
        return description;
    }

    public void setDescription(BookDescription description) {
        this.description = description;
    }

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }



}
