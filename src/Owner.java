import java.util.ArrayList;
import java.util.List;

public class Owner {
    public Long userId;
    public List<Integer> bookId = new ArrayList<>();


    public Owner(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void receiveBorrowedBook() {

    }

    public double registerBook() {
        return 0;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Integer> getBookId() {
        return bookId;
    }

    public void setBookId(List<Integer> bookId) {
        this.bookId = bookId;
    }
}
