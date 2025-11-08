//it23017
package com.user;

/**
 * Demonstrates strong encapsulation for a UserProfile.
 * Data is private, and public setters validate new values.
 */
public class UserProfile {

    // --- Private Data (Fields) ---
    // Kept private to prevent direct, uncontrolled modification.
    private String username;
    private String email;

    // --- Public Interface (Methods) ---

    /**
     * Public "getter" for the username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Public "setter" for the username with validation.
     */
    public void setUsername(String newUsername) {
        // Validation: Enforce a minimum username length.
        if (newUsername != null && newUsername.length() >= 4) {
            this.username = newUsername;
        } else {
            // Inform the user that the change was rejected.
            System.out.println("Validation Error: Username must be at least 4 characters.");
        }
    }

    /**
     * Public "getter" for the email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Public "setter" for the email with validation.
     */
    public void setEmail(String newEmail) {
        // Validation: Ensure the email contains an "@" symbol.
        if (newEmail != null && newEmail.contains("@")) {
            this.email = newEmail;
        } else {
            // Inform the user that the change was rejected.
            System.out.println("Validation Error: Email must contain an '@' symbol.");
        }
    }

    /**
     * A public method that displays the object's state.
     */
    public void displayProfile() {
        System.out.println("--- User Profile ---");
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("--------------------");
    }
}
