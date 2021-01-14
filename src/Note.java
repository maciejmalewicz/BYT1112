import java.util.Date;

public class Note {

    private String ISBN;
    private String contentNote;
    private Date dateOfUpdate;

    //association
    private User addedBy;

    public Note(String ISBN, String contentNote, Date dateOfUpdate, User addedBy) {
        this.ISBN = ISBN;
        this.contentNote = contentNote;
        this.dateOfUpdate = dateOfUpdate;
        this.addedBy = addedBy;
    }

    public void editNote(String ISBN, String contentNote, Date dateOfUpdate){

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
