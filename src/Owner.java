import java.util.ArrayList;
import java.util.List;

public class Owner {
    public Long userID;
    //association
    public List<Long> bookIds = new ArrayList<>();

    public Owner(Long userId) {
        this.userID = userId;
    }

    public void receiveBorrowedBook() {

    }

    public double registerBook() {
        return 0;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public List<Long> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<Long> bookIds) {
        this.bookIds = bookIds;
    }
}
