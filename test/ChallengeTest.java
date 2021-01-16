import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class ChallengeTest {

    Challenge challengeTested;

    @Before
    public void setup(){
        challengeTested = new Challenge(new Date(24-01-2020),90,20);
        challengeTested.setNumberOfPagesToRead(90);
        challengeTested.setNumberOfAlreadyReadPages(20);
        challengeTested.setDateDueChallenge(new Date(24-01-2020));
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(challengeTested.getNumberOfAlreadyReadPages(),90);
    }

    @Test
    public void testGetters(){
        TestUtils.testGetter(challengeTested, "getNumberOfPagesToRead", "numberOfPagesToRead");
        TestUtils.testGetter(challengeTested, "getNumberOfAlreadyReadPages", "numberOfAlreadyReadPages");
        TestUtils.testGetter(challengeTested, "getDateDueChallenge", "dateDueChallenge");
    }

    @Test
    public void testSetters() {
        TestUtils.testSetter(challengeTested, "setNumberOfPagesToRead", "numberOfPagesToRead", "34");
        TestUtils.testSetter(challengeTested, "setDateDueChallenge", "dateDueChallenge", "24-01-2000");
        TestUtils.testSetter(challengeTested, "setNumberOfAlreadyReadPages", "numberOfAlreadyReadPages", "32");
    }

}

