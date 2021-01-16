import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

public class NoteTest {

    public Date testDate;
    public Note tested;

    @Before
    public void setup(){
        testDate = new Date();
        tested = new Note("AAASDC", "Very interesting", testDate, new User(1L));
    }

    @Test
    public void testConstruction(){
        Assert.assertEquals(tested.getISBN(), "AAASDC");
        Assert.assertEquals(tested.getContentNote(), "Very interesting");
        Assert.assertEquals(tested.getDateOfUpdate(), testDate);
        Assert.assertEquals(tested.getAddedBy().getUserID(), Long.valueOf(1L));
    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(tested, "getContentNote", "contentNote");
        TestUtils.testGetter(tested, "getISBN", "ISBN");
        TestUtils.testGetter(tested, "getDateOfUpdate", "dateOfUpdate");
        TestUtils.testGetter(tested, "getAddedBy", "addedBy");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(tested, "setContentNote", "contentNote", "anything");
        TestUtils.testSetter(tested, "setISBN", "ISBN", "AABBCC");
        TestUtils.testSetter(tested, "setDateOfUpdate", "dateOfUpdate", new Date());
        TestUtils.testSetter(tested, "setAddedBy", "addedBy", new User(50L));
    }
}
