/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author b7708
 */
// This holds the user details
class User {
    String firstName;
    String lastName;
    String phone;
    String username;
    String password;

    public User(String f, String l, String p, String u, String pass) {
        this.firstName = f;
        this.lastName = l;
        this.phone = p;
        this.username = u;
        this.password = pass;
    }
}

// This checks all the rules for the inputs
public class Validation {

    public static boolean checkUserName(String username) {
        if (username != null && username.contains("_")) {
            return true;
        }
        return false;
    }

    public static boolean checkPasswordComplexity(String pass) {
        if (pass == null || pass.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return hasUpper && hasDigit && hasSpecial;
    }

    public static boolean checkCellPhoneNumber(String phone) {
        if (phone == null || phone.length() < 11 || phone.length() > 16) {
            return false;
        }

        if (phone.charAt(0) != '+') {
            return false;
        }

        for (int i = 1; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false; 
            }
        }
        return true;
    }

    public static String getRegistrationStatus(boolean u, boolean p, boolean c) {
        if (u && p && c) {
            return "✅ Registration Successful!";
        } else {
            return "❌ Registration Failed!";
        }
    }
}
