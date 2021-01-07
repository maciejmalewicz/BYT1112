public class Challenge {
    private int NumberOfPagesToRead;
    private int NumberOfAlreadyReadPage;
    private Date dateDueChallenge;

    public Challenge() {
    }

    public Challenge(int numberOfPagesToRead, int numberOfAlreadyReadPage, Date dateDueChallenge) {
        NumberOfPagesToRead = numberOfPagesToRead;
        NumberOfAlreadyReadPage = numberOfAlreadyReadPage;
        this.dateDueChallenge = dateDueChallenge;
    }


    public void addChallenge() {

    }

    public void completeChallenge() {

    }

    public void markProgress() {

    }

    public void deleteChallenge() {

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