package psu.edu.attendancetracking;

public class Student {
    String name;
    int userID;
    private String password;
    String email;
    boolean present;

    public Student(String name1, int iD, String pass, String mail, boolean pres) {

        name = name1;
        userID = iD;
        password = pass;
        email = mail;
        present = pres;

    }


    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
