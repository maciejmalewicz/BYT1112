import java.util.Date;

public class Challenge {
    public static Date dateDueChallenge;
    private int numberOfPagesToRead;
    private int numberOfAlreadyReadPage;

    public Challenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }

    public Challenge(int numberOfPagesToRead, int numberOfAlreadyReadPage) {
        this.numberOfPagesToRead = numberOfPagesToRead;
        this.numberOfAlreadyReadPage = numberOfAlreadyReadPage;
       //dateDueChallenge = dateDueChallenge;
    }

    public int addChallenge(){
        return numberOfPagesToRead;

    }
    public int completeChallenge(){
        return numberOfAlreadyReadPage;

    }
    public int markProgress(){
        return numberOfAlreadyReadPage;

    }
    public void deleteChallenge(){


    }

    public int getNumberOfPagesToRead() {
        return numberOfPagesToRead;
    }

    public void setNumberOfPagesToRead(int numberOfPagesToRead) {
        this.numberOfPagesToRead = numberOfPagesToRead;
    }

    public int getNumberOfAlreadyReadPage() {
        return numberOfAlreadyReadPage;
    }

    public void setNumberOfAlreadyReadPage(int numberOfAlreadyReadPage) {
        this.numberOfAlreadyReadPage = numberOfAlreadyReadPage;
    }

    public Date getDateDueChallenge() {
        return dateDueChallenge;
    }

    public void setDateDueChallenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }
    }