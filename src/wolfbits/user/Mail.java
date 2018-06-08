package wolfbits.user;

public class Mail {

    private String Subject;
    private String receiver;
    private String body;
    private String newPassword;

    public Mail(String receiver, String newPassword) {
        this.newPassword = newPassword;
        this.Subject = "Password change";
        this.receiver = receiver;
        this.body = "Hello there! you asked for a new password and here it is! \n"
                + "Enjoy our app and please still pushing with us for a better world for ours animal friends!\n"
                + "\n"
                + "\n"
                + "New password: " + this.newPassword;
    }

    public void setSubject(String subject) {
        this.Subject = subject;
    }

    public String getSubject() {
        return this.Subject;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void sentMail() {

    }
}
