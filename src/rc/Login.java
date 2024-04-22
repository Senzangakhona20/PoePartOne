/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author Senzangakhona Ndaba [ST10457964]
 */
public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Constructor
    public Login() {
        this.username = "";
        this.password = "";
        this.firstName = "";
        this.lastName = "";
    }

    // Method to check if username is in the correct order
    public boolean checkUsername(String username) {
        if (username.length() <= 5 && username.contains("_")) {
            return true;
        } else {
            return false;
        }
    }

    // This method checks that the password meets complexity requirements
    public boolean checkPasswordComplexity(String password) {
      
        return password.length() >= 8 && password.matches(".[A-Z].") && password.matches(".\\d.") && password.matches(".[!@#$%^&()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }

    // Method registers the user
    public String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUsername(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character";
        } else {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            return "User successfully registered";
        }
    }

    // Method to verify login
    public boolean loginUser(String username, String password) {
        return (this.username.equals(username) && this.password.equals(password));
    }

    // Method returns status message of  the login
    public String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again";
        } else {
            return "Username or password incorrect, please try again";
        }
    }
}