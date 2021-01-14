import java.util.ArrayList;
import java.util.List;

public class Owner {
    public Long userId;
    public List<Integer> bookIds = new ArrayList<>();

    public Owner(Long userId) {
        this.userId = userId;
    }

    public void receiveBorrowedBook() {

    }

    public double registerBook() {
        return 0;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Integer> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<Integer> bookIds) {
        this.bookIds = bookIds;
    }
}
