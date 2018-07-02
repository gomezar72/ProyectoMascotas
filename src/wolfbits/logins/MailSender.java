
package wolfbits.logins;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
 
        
    
        private static final Properties properties = new Properties();
	
	
      
	private static Session session;
        
        

     public static void SendMail(String subject, String content, Address address) throws MessagingException, UnsupportedEncodingException{
      //Create session
        Properties props = System.getProperties();
        props.put("mail.smtp.user", "111miltotomail@gmail.com");
        props.put("mail.smtp.password", "f3#Tomate");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.enable", "true");
         props.put("mail.smtp.port", "465");

        javax.mail.Authenticator auth = null;
        auth = new javax.mail.Authenticator() {
            @Override
            public javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("111miltotomail@gmail.com", "f3#Tomate");
            }
        };
        session = Session.getInstance(props, auth);
        //get transport object from session and connect to mail server
        Transport tr = session.getTransport("smtp");
        tr.connect(session.getProperty("mail.smtp.host"),  session.getProperty("mail.smtp.user"), session.getProperty("mail.smtp.password"));


        Message msg = new MimeMessage(session);
    
        
    Address a = new InternetAddress("111miltotomail@gmail.com", "PetNewWaveTectors");


    msg.setContent(content, "text/plain");
    msg.setFrom(a);
    msg.setRecipient(Message.RecipientType.TO, address);
    msg.setSubject(subject);
   
        msg.saveChanges();
        tr.sendMessage(msg, msg.getAllRecipients());
        tr.close();
}
     
    
}
