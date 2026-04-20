/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author b7708
 */
import java.util.Scanner;

public class Main {
    // 1. Create a fixed-size array (holds up to 100 users)
    public static User[] database = new User[100];
    
    // 2. A counter to keep track of how many users have signed up
    public static int userCount = 0; 
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n~~~~ MAIN CHAT APP MENU ~~~~");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose one of the option: ");
            
            String choice = input.nextLine();

            if (choice.equals("1")) {
                registerUser();
            } else if (choice.equals("2")) {
                // Call the Login class and hand over the database so it can search
                Login.loginUser(database, userCount, input);
            } else if (choice.equals("3")) {
                System.out.println("Goodbye!");
                break; // Stops the loop
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }

    public static void registerUser() {
        if (userCount >= database.length) {
            System.out.println("❌ Error: The database is full. Cannot register new users.");
            return; 
        }

        System.out.print("First Name: ");
        String fName = input.nextLine();
        System.out.print("Last Name: ");
        String lName = input.nextLine();

        String phone;
        while (true) {
            System.out.print("Phone (must start with +): ");
            phone = input.nextLine();
            if (Validation.checkCellPhoneNumber(phone)) {
                break; 
            }
            System.out.println("Invalid phone format!");
        }

        String user;
        while (true) {
            System.out.print("Username (must have _): ");
            user = input.nextLine();
            if (Validation.checkUserName(user)) {
                break;
            }
            System.out.println("Username must contain an underscore!");
        }

        String pass;
        while (true) {
            System.out.print("Password (8+ chars, Upper, Number, Special): ");
            pass = input.nextLine();
            if (Validation.checkPasswordComplexity(pass)) {
                break;
            }
            System.out.println("Password is too weak!");
        }

        // Add to the array at the current empty spot, then increase the counter
        database[userCount] = new User(fName, lName, phone, user, pass);
        userCount++; 
        
        System.out.println(Validation.getRegistrationStatus(true, true, true));
    }
}
 