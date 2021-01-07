public class ReadingProgress {
    private int pagesRead;

    public ReadingProgress(int noOfPagesRead){
        this.pagesRead=noOfPagesRead;

    }

    public void updateProgress(int noOfPagesRead){
    this.pagesRead=pagesRead+noOfPagesRead;
    }
    public void deleteProgress(){
    this.pagesRead=0;
    }

    public int getPagesRead() {
        return pagesRead;
    }
}
