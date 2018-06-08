package wolfbits.post;

import wolfbits.user.User;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Comment {

    private User user;
    private Date date;
    private String body;
    private boolean isdeleted;

    public Comment() {
    }

    public Comment(User user, String body) {
        this.user = user;
        this.body = body;
        this.isdeleted = false;
        Calendar dateNow = new GregorianCalendar();
        int year = dateNow.get(Calendar.YEAR);
        int month = dateNow.get(Calendar.MONTH);
        int day = dateNow.get(Calendar.DAY_OF_MONTH);
        int hour = dateNow.get(Calendar.HOUR_OF_DAY);

        Date actualDate = new Date(month, day, year);
        this.date = actualDate;

    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void setdate() {
        Calendar date = new GregorianCalendar();
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);

        Date actualDate = new Date(month, day, year);
        this.date = actualDate;

    }

    public Date getDate() {
        return this.date;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void setisDeleted(boolean isDel) {
        this.isdeleted = isDel;
    }

    public boolean getIsDeleted() {
        return this.isdeleted;
    }

}
