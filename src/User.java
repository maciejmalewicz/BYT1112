import java.util.ArrayList;
import java.util.List;

public class User extends Owner{

    private String name;
    private String surname;
    private List<Note> notes = new ArrayList<>();
    private List<Challenge> challenges = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();
    private List<BookBorrowing> bookBorrowings = new ArrayList<>();
    private List<ReadingProgress> readingProgresses = new ArrayList<>();

    public User(Long userId){
        super(userId);
    }

    public User(Long userId, String name, String surname) {
        super(userId);
        this.name = name;
        this.surname = surname;
    }

    //returns true if there is such combination of username and password
    public boolean registerSelf(String user, String password){
        return false;
    }

    public void notifyAboutDueDate(){

    }

    public void addNote(Note note){

    }

    public void deleteNote(Note note){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<BookBorrowing> getBookBorrowings() {
        return bookBorrowings;
    }

    public void setBookBorrowings(List<BookBorrowing> bookBorrowings) {
        this.bookBorrowings = bookBorrowings;
    }

    public List<ReadingProgress> getReadingProgresses() {
        return readingProgresses;
    }

    public void setReadingProgresses(List<ReadingProgress> readingProgresses) {
        this.readingProgresses = readingProgresses;
    }
}
