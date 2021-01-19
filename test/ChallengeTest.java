import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class ChallengeTest {

    Challenge challengeTested;
    public Date testDate;



    @Before
    public void setup(){
        testDate = new Date();
        challengeTested = new Challenge(testDate,90,20);
        challengeTested.setNumberOfPagesToRead(90);
        challengeTested.setNumberOfAlreadyReadPages(20);
        challengeTested.setDateDueChallenge(testDate);
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(challengeTested.getNumberOfAlreadyReadPages(),20);
    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(challengeTested, "getNumberOfPagesToRead", "numberOfPagesToRead");
        TestUtils.testGetter(challengeTested, "getNumberOfAlreadyReadPages", "numberOfAlreadyReadPages");
        TestUtils.testGetter(challengeTested, "getDateDueChallenge", "dateDueChallenge");
    }

    @Test
    public void testSetters() {
        TestUtils.testSetter(challengeTested, "setNumberOfPagesToRead", "numberOfPagesToRead", 34);
        TestUtils.testSetter(challengeTested, "setDateDueChallenge", "dateDueChallenge", new Date());
        TestUtils.testSetter(challengeTested, "setNumberOfAlreadyReadPages", "numberOfAlreadyReadPages", 32);
    }

}

