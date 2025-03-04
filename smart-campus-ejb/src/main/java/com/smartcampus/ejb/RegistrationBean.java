package com.smartcampus.ejb;

import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import com.smartcampus.ejb.entity.Student;

@Stateless
public class RegistrationBean {

    public String registerStudent(@NotNull String firstName, @NotNull String lastName, @NotNull @Email String email) {
        // Business logic for student registration.
        // (In production, you would persist the student entity using JPA.)
        return "Student " + firstName + " " + lastName + " registered successfully with email " + email;
    }
}

