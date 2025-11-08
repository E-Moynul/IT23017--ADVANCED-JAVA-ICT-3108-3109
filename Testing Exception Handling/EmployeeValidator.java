package com.validation.validator;

import com.validation.exceptions.InvalidAgeException;
import com.validation.exceptions.InvalidDeptException;
import java.util.List;

public class EmployeeValidator {

    private List<String> validDepts = List.of("HR", "ENGINEERING", "FINANCE", "MARKETING");

    public void validate(int age, String dept) throws InvalidAgeException, InvalidDeptException {
        
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid Age: Must be between 18 and 60.");
        }

        if (!validDepts.contains(dept.toUpperCase())) {
            throw new InvalidDeptException("Invalid Dept: '" + dept + "' is not a valid department.");
        }

        System.out.println("Validation Successful: Age and Department are valid.");
    }
}
