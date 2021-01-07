import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;
    private String name;
    private String surname;
    private List<Note> notes = new ArrayList<>();

    public User(){

    }

    public User(Long userId, String name, String surname) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }

    //returns true if there is such combination of username and password
    public boolean registerSelf(String user, String password){
        return false;
    }

    public void notifyAboutDueDate(){

    }

    public void addNote(Note note){

    }

    public void deleteNote(Note note){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
