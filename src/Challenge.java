public class Challenge {
    private int NumberOfPagesToRead;
    private int NumberOfAlreadyReadPage;
    private String dateDueChallenge;

    public Challenge() {
    }

    public Challenge(int numberOfPagesToRead, int numberOfAlreadyReadPage, String dateDueChallenge) {
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

    public String getDateDueChallenge() {
        return dateDueChallenge;
    }

    public void setDateDueChallenge(String dateDueChallenge) {
        this.dateDueChallenge = dateDueChallenge;
    }
}