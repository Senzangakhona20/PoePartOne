/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Senzangakhona Ndaba [St10457964] 
 */
public class UserInput {

        public static void main(String[] args) {
        Login login = new Login();

        // Registration
        String username = JOptionPane.showInputDialog("Insert username:");
        String password = JOptionPane.showInputDialog("Insert password:");
        String firstName = JOptionPane.showInputDialog("Insert first name:");
        String lastName = JOptionPane.showInputDialog("Insert last name:");

        JOptionPane.showMessageDialog(null, login.registerUser(username, password, firstName, lastName));

        // Login
        String loginUsername = JOptionPane.showInputDialog("Insert username:");
        String loginPassword = JOptionPane.showInputDialog("Insert password:");

        boolean loginStatus = login.loginUser(loginUsername, loginPassword);

        JOptionPane.showMessageDialog(null, login.returnLoginStatus(loginStatus));
    }
}
