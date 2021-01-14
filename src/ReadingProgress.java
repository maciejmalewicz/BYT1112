public class ReadingProgress {
    private String ISBN;
    private int pagesRead;

    public ReadingProgress(String ISBN, int noOfPagesRead){
        this.pagesRead=noOfPagesRead;
        this.ISBN = ISBN;
    }

    public void updateProgress(int noOfPagesRead){

    }

    public void deleteProgress(){
        this.pagesRead=0;
    }


    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
