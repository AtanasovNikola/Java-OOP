package exception.customException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private String username;
    private String password;

    public Client(String username, String password) throws MyException {

        this.setUsername(username);
        this.setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws MyException {

        if (username.length() < 4 || username.isBlank() || username.length() > 10) {
            throw new MyException("The username`s length should be in range [4...10]");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws MyException {
        String regex = "^[A-Za-z0-9]{4,8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            this.password = password;
        } else {
            throw new MyException("The password should contains only the following symbols :" +
                    " [A-Z,a-z,0-9] and must be in the range of [4...8]");
        }
    }
}
