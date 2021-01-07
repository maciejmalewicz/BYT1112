import java.util.Date;

public class Note {

    private String ISBN;
    private String contentNote;
    private Date dateOfUpdate;
    private User addedBy;
    private Book about;

    public Note() {
    }

    public Note(String ISBN, String contentNote, Date dateOfUpdate, User addedBy, Book book) {
        this.ISBN = ISBN;
        this.contentNote = contentNote;
        this.dateOfUpdate = dateOfUpdate;
    }

    public void editNote(String ISBN, String contentNote, Date dateOfUpdate){

    }

    public void notifyAboutDueDate(){

    }

    public Book getAbout() {
        return about;
    }

    public void setAbout(Book about) {
        this.about = about;
    }

    public String readNote(){
        return null;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String contentNote) {
        this.contentNote = contentNote;
    }

    public Date getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(Date dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }
}
