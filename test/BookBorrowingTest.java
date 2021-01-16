import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class BookBorrowingTest {

    public BookBorrowing testBookBorrowing;
    public Date testDateLent;
    public Date testDateDue;

    @Before
    public void setup(){
        testDateLent = new Date();
        testDateDue = new Date();
        testBookBorrowing = new BookBorrowing(testDateLent,testDateDue,new User(1L),new Book(1L));
    }

    @Test
    public void testConstruction(){
        Assert.assertEquals(testBookBorrowing.getDateLent(),testDateLent );
        Assert.assertEquals(testBookBorrowing.getDateDue(),testDateDue );
        Assert.assertEquals(testBookBorrowing.getBorrower().userID, Long.valueOf(1L));
        Assert.assertEquals(testBookBorrowing.getBook().getBookId(), Long.valueOf(1L));
    }
    @Test
    public void testGetters(){
        TestUtils.testGetter(testBookBorrowing, "getDateLent", "dateLent");
        TestUtils.testGetter(testBookBorrowing, "getDateDue", "dateDue");
        TestUtils.testGetter(testBookBorrowing, "getBorrower", "borrower");
        TestUtils.testGetter(testBookBorrowing, "getBook", "book");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(testBookBorrowing, "setDateLent", "dateLent", new Date());
        TestUtils.testSetter(testBookBorrowing, "setDateDue", "dateDue", new Date());
        TestUtils.testSetter(testBookBorrowing, "setBorrower", "borrower", new User(1L));
        TestUtils.testSetter(testBookBorrowing, "setBook", "book", new Book(50L));
    }
}
