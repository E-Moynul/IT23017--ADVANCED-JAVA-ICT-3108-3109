//it23017
package com.main;

import com.validation.exceptions.InvalidAgeException;
import com.validation.exceptions.InvalidDeptException;
import com.validation.validator.EmployeeValidator;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeValidator validator = new EmployeeValidator();

        try {
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Department (HR, Engineering, Finance, Marketing): ");
            String dept = scanner.nextLine();

            validator.validate(age, dept);

        } catch (InvalidAgeException | InvalidDeptException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Error: Please enter a valid number for age.");
        } finally {
            scanner.close();
        }
    }
}
