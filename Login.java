/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author b7708
 */
import java.util.Scanner;

public class Login {
    
    // We bring in the database array, the userCount, and the scanner from Main
    public static void loginUser(User[] database, int userCount, Scanner input) {
        System.out.print("Enter Phone: ");
        String loginPhone = input.nextLine();
        System.out.print("Enter Password: ");
        String loginPass = input.nextLine();

        // Loop only through the spots that actually have users
        for (int i = 0; i < userCount; i++) {
            User current = database[i]; 
            
            // Check if the credentials match
            if (current.phone.equals(loginPhone) && current.password.equals(loginPass)) {
                System.out.println("✅ Welcome " + current.firstName + "! You are now logged in.");
                return; // Ends the method successfully
            }
        }
        System.out.println("❌ Login failed. User not found or incorrect password.");
    }
}
 