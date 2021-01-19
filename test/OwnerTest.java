import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OwnerTest {


    public Date testDate;
    public Owner testOwner;
    public List<Long> bookIds;


    @Before
    public void setup(){
        testDate = new Date();
        testOwner = new Owner(1L);
        bookIds = new ArrayList<>();


    }

    @Test
    public void testConstruction(){
        Assert.assertEquals(testOwner.getUserID() ,Long.valueOf(1L));
        Assert.assertEquals(testOwner.getBookIds(), bookIds);

    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(testOwner, "getUserID()", "userID");
        TestUtils.testGetter(testOwner, "getBookIds()", "bookIds");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(testOwner, "setUserID", "userID", 1L);
        TestUtils.testSetter(testOwner, "setBookIds", "bookIds", 1L);
    }
}


