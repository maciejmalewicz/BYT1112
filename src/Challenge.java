import java.util.Date;

public class Challenge {
    public Date dateDueChallenge;
    private int numberOfPagesToRead;
    private int numberOfAlreadyReadPages;

    public Challenge(Date dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }

    public Challenge(Date date, int numberOfPagesToRead, int numberOfAlreadyReadPage) {
        this.numberOfPagesToRead = numberOfPagesToRead;
        this.numberOfAlreadyReadPages = numberOfAlreadyReadPage;
       //dateDueChallenge = dateDueChallenge;
    }


    public void completeChallenge(){

    }

    public void markProgress(int progress){

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