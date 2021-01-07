import org.junit.Assert;
import org.junit.Test;

public class ReadingProgressTest {

    @Test
    public void canCreateProgress(){
        ReadingProgress testProgress = new ReadingProgress("1",250);
        Assert.assertNotNull(testProgress);
    }
    @Test
    public void getterTest(){
        ReadingProgress testProgress = new ReadingProgress("2",500);
        Assert.assertEquals(500,testProgress.getPagesRead());
    }
    @Test
    public void setterTest(){
        ReadingProgress testProgress = new ReadingProgress("3",100);
        Assert.assertEquals(100,testProgress.getPagesRead());
        testProgress.setPagesRead(50);
        Assert.assertEquals(50,testProgress.getPagesRead());
    }
    @Test
    public void canDeleteProgress(){
        ReadingProgress testProgress = new ReadingProgress("4",50);
        Assert.assertEquals(50,testProgress.getPagesRead());
        testProgress.deleteProgress();
        Assert.assertEquals(0,testProgress.getPagesRead());
    }

}
