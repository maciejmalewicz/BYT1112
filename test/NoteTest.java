import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;

public class NoteTest {

    public Note tested;

    @Before
    public void setup(){
        tested = new Note("AAASDC", "Very interesting", new Date(), new User(1l));
    }

    @Test
    public void testGetContent(){
        TestUtils.testGetter(tested, "getContentNote", "contentNote");
        TestUtils.testGetter(tested, "getISBN", "ISBN");
    }

    @Test
    public void testSetContent(){
        TestUtils.testSetter(tested, "setContentNote", "contentNote", "mienso");
    }
}
