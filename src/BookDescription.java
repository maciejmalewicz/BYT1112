public class BookDescription {
    private String ISBN;
    private String contentDescription;

    public BookDescription(String ISBN, String content){
        this.ISBN=ISBN;
        this.contentDescription=content;
    }

    public static String readDescription(String ISBN){
        return "Some book description";
    }

    public void uploadDescription(String ISBN, String content){
        //method stub
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
