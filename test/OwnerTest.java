import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class OwnerTest {


    public Date testDate;
    public Owner testOwner;

    @Before
    public void setup(){
        testDate = new Date();
        testOwner = new Owner(1L);
    }

    @Test
    public void testConstruction(){
        Assert.assertEquals(testOwner.getUserID(), "1");
        Assert.assertEquals(testOwner.getBookIds(), "1");

    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(testOwner, "getUserID()", "userID");
        TestUtils.testGetter(testOwner, "getBookIds()", "bookIds");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(testOwner, "setUserID", "userID", "1");
        TestUtils.testSetter(testOwner, "setBookIds", "bookIds", "1");
    }
}


