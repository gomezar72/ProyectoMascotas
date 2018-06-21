package wolfbits.logins;

import java.util.Date;
import wolfbits.user.User;

public class LogIn {
    private User user;
    private String password;
    boolean isLogued;
    Date LastActivity;
    
    public LogIn(User user, String password){
        
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsLogued() {
        return isLogued;
    }

    public void setIsLogued(boolean isLogued) {
        this.isLogued = isLogued;
    }

    public Date getLastActivity() {
        return LastActivity;
    }

    public void setLastActivity(Date LastActivity) {
        this.LastActivity = LastActivity;
    }
}

