import org.junit.Assert;
import org.junit.Test;

public class BookDescriptionTest {

    @Test
    public void canCreateBookDescription() {
        BookDescription testBookDescription = new BookDescription("1", "Some book description ...");
        Assert.assertNotNull(testBookDescription);
    }

    @Test
    public void getterTest() {
        BookDescription testBookDescription = new BookDescription("2", "Yet another book description.");
        Assert.assertEquals("Yet another book description.", testBookDescription.getContentDescription());
    }
    @Test
    public void setterTest(){
        BookDescription testBookDescription = new BookDescription("3","Third book description");

        Assert.assertEquals("Third book description",testBookDescription.getContentDescription());
        testBookDescription.setContentDescription("Modified book description");
        Assert.assertEquals("Modified book description",testBookDescription.getContentDescription());
    }
}
