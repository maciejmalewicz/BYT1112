import java.util.Calendar;
import java.util.Date;

public class Review {

    private int reviewID = 0;
    private final String ISBN;
    private final String contentDescription;
    private int whoWroteUID;
    private Date dateOfUpdate;

    public Review(String ISBN, String content){
        this.reviewID= ++reviewID;
        this.ISBN = ISBN;
        this.contentDescription=content;
        //TODO: once all the parts is ready here's where we'll link user with his review
        // this.whoWroteUID=
        this.dateOfUpdate= Calendar.getInstance().getTime();
    }

    public String readReview(){
    return "Review of a book";
    }

    public void deleteReview(int deletedID){
    };

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public int getWhoWroteUID() {
        return whoWroteUID;
    }

    public void setWhoWroteUID(int whoWroteUID) {
        this.whoWroteUID = whoWroteUID;
    }

    public Date getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(Date dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }
}
