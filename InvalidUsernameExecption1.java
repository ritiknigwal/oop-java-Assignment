//A-2 Ques25//


class InvalidUsernameException1 extends Exception {
    public InvalidUsernameException1(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserAuthentication {

    public static void validateCredentials(String username, String password, String confirmPassword) 
            throws InvalidUsernameException1, PasswordMismatchException {

        if (username.length() < 6) {
            throw new InvalidUsernameException1"Username must be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Password does not match.");
        }

        System.out.println("User credentials are valid!");
    }

    public static void main(String[] args) {
        String username = "user"; 
        String password = "password123";
        String confirmPassword = "password123";

        try {
           
            validateCredentials(username, password, confirmPassword);
        } catch (InvalidUsernameException1 | PasswordMismatchException e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }
}