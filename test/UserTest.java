import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UserTest {


    User tested;

    @Before
    public void setup(){
        tested = new User(10L);
        tested.setName("Andrzej");
        tested.setSurname("Papuch");
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(tested.getUserID(), Long.valueOf(10L));
    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(tested, "getName", "name");
        TestUtils.testGetter(tested, "getSurname", "surname");
        TestUtils.testGetter(tested, "getNotes", "notes");
        TestUtils.testGetter(tested, "getChallenges", "challenges");
        TestUtils.testGetter(tested, "getReviews", "reviews");
        TestUtils.testGetter(tested, "getBookBorrowings", "bookBorrowings");
        TestUtils.testGetter(tested, "getReadingProgresses", "readingProgresses");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(tested, "setName", "name", "Arnold");
        TestUtils.testSetter(tested, "setSurname", "surname", "Krawczyk");
        TestUtils.testSetter(tested, "setNotes", "notes", new ArrayList<>());
        TestUtils.testSetter(tested, "setChallenges", "challenges", new ArrayList<>());
        TestUtils.testSetter(tested, "setReviews", "reviews", new ArrayList<>());
        TestUtils.testSetter(tested, "setBookBorrowings", "bookBorrowings", new ArrayList<>());
        TestUtils.testSetter(tested, "setReadingProgresses", "readingProgresses", new ArrayList<>());
    }

}
