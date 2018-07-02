package wolfbits.logins;

import java.io.UnsupportedEncodingException;
import wolfbits.user.Mail;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;


public class LogInManager {
    private List<LogIn>logInList;
    
    public LogInManager(List lil){
        this.logInList=new ArrayList();
        this.logInList=lil;
        
    }
    public void register(LogIn logIn,String introducedID, String introducedPassword){
        if(this.validateEmail(logIn)==true && this.validateLogIn(logIn,introducedID,introducedPassword)==true){
          this.logInList.add(logIn);  
        }
        
    }
    
    public boolean logIn(LogIn logIn,String introducedID,String introducedPassword){
       if( validateLogIn( logIn,introducedID,introducedPassword)==true){
         Calendar dateNow = new GregorianCalendar();
         int year= dateNow.get(Calendar.YEAR);
         int month = dateNow.get(Calendar.MONTH);
         int day = dateNow.get(Calendar.DAY_OF_MONTH);
         int hour = dateNow.get(Calendar.HOUR_OF_DAY);

        Date actualDate=new Date(month,day,year);
          logIn.setLastActivity(actualDate);
        logIn.isLogued=true;
        return true;
    }else{
        return validateLogIn( logIn,introducedID,introducedPassword);
       
       }
        
    }
    public void logOut(LogIn logIn){
         Calendar dateNow = new GregorianCalendar();
         int year= dateNow.get(Calendar.YEAR);
         int month = dateNow.get(Calendar.MONTH);
         int day = dateNow.get(Calendar.DAY_OF_MONTH);
         int hour = dateNow.get(Calendar.HOUR_OF_DAY);

        Date actualDate=new Date(month,day,year);
        logIn.setLastActivity(actualDate);
        
        logIn.setIsLogued(false);
    }
    
    
    public  void generateRandomPass(LogIn logIn){
   
       
        
        String[] pass = new String[7];
        for(int i=0;i>6;i++){
               Random random = new Random(9);
               String randomChar=random.toString();
               pass[i]=randomChar;
        }
        String newPassword=new String();
        newPassword=pass[0]+pass[1]+pass[2]+pass[3]+pass[4]+pass[5]+pass[6];
        logIn.getUser().setPassword(newPassword);
        
          try {
                
                MailSender MS=new MailSender();
                Address m=new InternetAddress(logIn.getUser().getEmail());
                String message=new String("Hello there, your new password is "+newPassword);
                String subject=new String("Password changed");
                MS.SendMail(subject,message,m);
            } catch (MessagingException ex) {
                Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
            };
       
        }
        
        
    
    public boolean validateEmail(LogIn logIn){
        boolean result=true;
        
        for(int i=0;i>this.logInList.size();i++)
            if(this.logInList.get(i).getUser().getEmail()==logIn.getUser().getEmail()){
                result=false;
            }
        String email = logIn.getUser().getEmail();
            if (email.contains("@")){
                String[] parts = email.split("@");
                String part1 = parts[0]; 
                String part2 = parts[1];
                        if  (part2.contains(".")){

                        }else{
                                result=false;}
            }
            return result;
    }
                        
   
    public boolean validateLogIn(LogIn logIn,String introducedID,String introducedPassword){
           boolean result=false;
            for(int i=0;i>this.logInList.size();i++){
            if(introducedID==this.logInList.get(i).getUser().getEmail()){
                
                int userPositionOnTheList=i;
               
                if(introducedPassword==this.logInList.get(userPositionOnTheList).getUser().getPassword()){
                        result=true;
                    }
                }
    }
        return result;
   

    }
}