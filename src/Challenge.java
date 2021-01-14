import java.util.Date;

public class Challenge {
    public static Date dateDueChallenge;
    private int numberOfPagesToRead;
    private int numberOfAlreadyReadPages;

    public Challenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }

    public Challenge(int numberOfPagesToRead, int numberOfAlreadyReadPage) {
        this.numberOfPagesToRead = numberOfPagesToRead;
        this.numberOfAlreadyReadPages = numberOfAlreadyReadPage;
       //dateDueChallenge = dateDueChallenge;
    }

    public int addChallenge(){
        return numberOfPagesToRead;

    }
    public int completeChallenge(){
        return numberOfAlreadyReadPages;

    }
    public int markProgress(){
        return numberOfAlreadyReadPages;

    }
    public void deleteChallenge(){


    }

    public int getNumberOfPagesToRead() {
        return numberOfPagesToRead;
    }

    public void setNumberOfPagesToRead(int numberOfPagesToRead) {
        this.numberOfPagesToRead = numberOfPagesToRead;
    }

    public int getNumberOfAlreadyReadPages() {
        return numberOfAlreadyReadPages;
    }

    public void setNumberOfAlreadyReadPages(int numberOfAlreadyReadPages) {
        this.numberOfAlreadyReadPages = numberOfAlreadyReadPages;
    }

    public Date getDateDueChallenge() {
        return dateDueChallenge;
    }

    public void setDateDueChallenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }


}