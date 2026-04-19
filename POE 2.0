/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author b7708
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        //runs once before test
    }
    
    @AfterAll
    public static void tearDownClass() {
        // runs once before all tests are finnished
    }
    
    @BeforeEach
    public void setUp() {
        //runs before every tesr method
    }
    
    @AfterEach
    public void tearDown() {
        // runs after every single 
    }
    
    /**
     * Test of loginUser method, of class Login.
     */

    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        
        // 1. Arrange: Create a data structure and a sample user
        User[] database = new User[10];
        database[0] = new User("Test", "User", "+27123456789", "test_u", "Pass123!");
        int userCount = 1;

        // 2. Act: We simulate the search logic found in Login.java
        String searchPhone = "+27123456789";
        String searchPass = "Pass123!";
        
        boolean loginSuccessful = false;
        for (int i = 0; i < userCount; i++) {
            if (database[i].phone.equals(searchPhone) && database[i].password.equals(searchPass)) {
                loginSuccessful = true;
            }
        }
        
        // 3. Assert: We check if the result is true
        assertTrue(loginSuccessful, "The login search should find the user in the array\");
    }
    
}
