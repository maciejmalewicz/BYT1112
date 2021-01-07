import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class ReviewTest {
    @Test
    public void canCreateReview(){
        Review testReview = new Review("1","Some review ...");
        Assert.assertNotNull(testReview);
    }
    @Test
    public void getterTest(){
        Review testReview = new Review("2","Some another review");
        Assert.assertEquals(1,testReview.getReviewID());
        //TODO: LINK Assert.assertEquals(1,testReview.getWhoWroteUID());
        Assert.assertEquals("Some another review",testReview.getContentDescription());
        Assert.assertTrue("Dates aren't close enough to each other!", (Calendar.getInstance().getTime().compareTo(testReview.getDateOfUpdate()) ) < 1000);
        Assert.assertEquals("2",testReview.getISBN());

    }
    @Test
    public void setterTest(){
        Review testReview = new Review("3","Third review contents");

        Assert.assertEquals(1,testReview.getReviewID());
        testReview.setReviewID(5);
        Assert.assertEquals(5,testReview.getReviewID());

        Assert.assertEquals(0,testReview.getWhoWroteUID());
        testReview.setWhoWroteUID(5);
        Assert.assertEquals(5,testReview.getWhoWroteUID());

        Calendar currentTimeAnd24H =Calendar.getInstance();
        currentTimeAnd24H.add(Calendar.HOUR,24);
        testReview.setDateOfUpdate(currentTimeAnd24H.getTime());
        Assert.assertTrue("Dates aren't close enough to each other!", (currentTimeAnd24H.getTime().compareTo(testReview.getDateOfUpdate()) ) < 1000);

    }
}
