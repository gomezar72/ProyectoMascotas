
package wolfbits.post;

import wolfbits.user.User;
import java.util.Date;


public class Complaint {
    
    private User user;
    private Date date;
    private String body;

    public Complaint() {
    }

    public Complaint(User user, String body) {
        this.user = user;
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
}
