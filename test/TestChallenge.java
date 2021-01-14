import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestChallenge {

    @Test
    public void addChallenge() {
        Challenge challengeTest=new Challenge(20,34 );
        Assert.assertEquals(20,34);

    }

    @Test
    public void completeChallenge() {
        Challenge challengeTest=new Challenge(10,9);
        Assert.assertNotNull(challengeTest);

    }

    @Test
    public void markProgress() {
        Challenge challengeTest=new Challenge(20,34 );
        Assert.assertEquals(20,34);


    }

    @Test
    public void deleteChallenge() {
        Challenge challengeTest=new Challenge(10,9);
        Assert.assertNotNull(challengeTest);

    }
    @Test
    public void getterTest() {
        Challenge challengeTest=new Challenge(Challenge.dateDueChallenge);
        Assert.assertEquals(12-04-2020, challengeTest.getDateDueChallenge());


    }
    @Test
    public void setterTest() {
        Challenge challengeTest=new Challenge(10,9);



    }
}