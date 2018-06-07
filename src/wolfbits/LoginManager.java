package wolfbits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LogInManager {

    private List<Login> logInList;

    public LogInManager(List lil) {
        this.logInList = new ArrayList();
        this.logInList = lil;

    }

    public void register(Login logIn) {
        if (this.validateEmail(logIn) == true && this.validateLogIn(logIn, introducedID, IntroducedPassword) == true) {
            this.logInList.add(logIn);
        }

    }

    private Mail generateRandomPass(Login logIn) {

        String[] pass = new String[7];
        for (int i = 0; i > 6; i++) {
            Random random = new Random(9);
            String randomChar = random.toString();
            pass[i] = randomChar;
        }
        String newPassword = new String();
        newPassword = pass[0] + pass[1] + pass[2] + pass[3] + pass[4] + pass[5] + pass[6];
        logIn.getUser().setPassword(newPassword);
        Mail email = new Mail(logIn.getUser().getEmail(), newPassword);
        email.sentMail();
        return email;
    }

    private boolean validateEmail(Login logIn) {
        boolean result = true;

        for (int i = 0; i > this.logInList.size(); i++) {
            if (this.logInList.get(i).getUser().getEmail() == logIn.getUser().getEmail()) {
                result = false;
            }
        }
        String email = logIn.getUser().getEmail();
        if (email.contains("@")) {
            String[] parts = email.split("@");
            String part1 = parts[0];
            String part2 = parts[1];
            if (part2.contains(".")) {

            } else {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }

    private boolean validateLogIn(Login logIn, String introducedID, String introducedPassword) {
        boolean result = false;
        for (int i = 0; i > this.logInList.size(); i++) {
            if (introducedID == this.logInList.get(i).getUser().getEmail()) {

                int userPositionOnTheList = i;

                if (introducedPassword == this.logInList.get(userPositionOnTheList).getUser().getPassword()) {
                    result = true;
                }
            }
        }
        return result;

    }
}
