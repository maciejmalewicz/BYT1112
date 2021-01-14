import java.util.Calendar;
import java.util.Date;

public class Review {

    private static Long reviewIDs = 0L;

    private Long reviewID;
    private final String ISBN;
    private final String contentDescription;
    private Long whoWroteUID;
    private Date dateOfUpdate;

    public Review(String ISBN, String content, Long whoWroteUID){
        this.reviewID = reviewIDs++;
        this.ISBN = ISBN;
        this.contentDescription=content;
        this.whoWroteUID = whoWroteUID;
        this.dateOfUpdate = Calendar.getInstance().getTime();
    }

    public String readReview(){
    return "Review of a book";
    }

    public void deleteReview(int deletedID){
        //method stub
    };

    public Long getReviewID() {
        return reviewID;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public Long getWhoWroteUID() {
        return whoWroteUID;
    }

    public void setWhoWroteUID(Long whoWroteUID) {
        this.whoWroteUID = whoWroteUID;
    }

    public Date getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(Date dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }

}
