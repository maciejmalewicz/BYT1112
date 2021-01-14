import java.util.Date;

public class Challenge {
    public static Date dateDueChallenge;
    private int NumberOfPagesToRead;
    private int NumberOfAlreadyReadPage;

    public Challenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }

    public Challenge(int numberOfPagesToRead, int numberOfAlreadyReadPage) {
        NumberOfPagesToRead = numberOfPagesToRead;
        NumberOfAlreadyReadPage = numberOfAlreadyReadPage;
       //dateDueChallenge = dateDueChallenge;
    }

    public int addChallenge(){
        return NumberOfPagesToRead;

    }
    public int completeChallenge(){
        return NumberOfAlreadyReadPage;

    }
    public int markProgress(){
        return NumberOfAlreadyReadPage;

    }
    public void deleteChallenge(){


    }

    public int getNumberOfPagesToRead() {
        return NumberOfPagesToRead;
    }

    public void setNumberOfPagesToRead(int numberOfPagesToRead) {
        NumberOfPagesToRead = numberOfPagesToRead;
    }

    public int getNumberOfAlreadyReadPage() {
        return NumberOfAlreadyReadPage;
    }

    public void setNumberOfAlreadyReadPage(int numberOfAlreadyReadPage) {
        NumberOfAlreadyReadPage = numberOfAlreadyReadPage;
    }

    public Date getDateDueChallenge() {
        return dateDueChallenge;
    }

    public void setDateDueChallenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }
    }