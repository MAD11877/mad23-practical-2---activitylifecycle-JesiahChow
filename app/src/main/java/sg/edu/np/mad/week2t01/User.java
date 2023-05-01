package sg.edu.np.mad.week2t01;

public class User {
    public int username = 0;
    public int password = 0;




    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public User(int username, int password) {
        this.username = username;
        this.password = password;
    }
}
