//it23017
package com.main;

// Import the UserProfile class from its package
import com.user.UserProfile;

/**
 * This main class demonstrates how to use the encapsulated
 * UserProfile class.
 */
public class App {

    public static void main(String[] args) {
        
        // --- 1. Create a user and set valid data ---
        System.out.println("Creating user1 and setting valid data...");
        UserProfile user1 = new UserProfile();

        // We CANNOT do this because 'username' is private:
        // user1.username = "alice"; 
        
        // We MUST use the public setter methods:
        user1.setUsername("alice_wonderland");
        user1.setEmail("alice@example.com");

        // We use the public getter to retrieve the data
        System.out.println("Get Username: " + user1.getUsername());
        user1.displayProfile();


        // --- 2. Create another user and attempt to set INVALID data ---
        System.out.println("\nCreating user2 and attempting to set invalid data...");
        UserProfile user2 = new UserProfile();

        // This attempt will be REJECTED by the setter's validation logic
        System.out.println("Attempting to set username to 'bob' (too short)...");
        user2.setUsername("bob");

        // This attempt will also be REJECTED
        System.out.println("Attempting to set email to 'invalid-email.com'...");
        user2.setEmail("invalid-email.com");

        // The fields will be 'null' because the invalid data was never assigned.
        user2.displayProfile();


        // --- 3. Now, set valid data for user2 ---
        System.out.println("\nSetting valid data for user2...");
        user2.setUsername("bob_the_builder");
        user2.setEmail("bob@builder.com");
        
        // Now it works
        user2.displayProfile();
    }
}
