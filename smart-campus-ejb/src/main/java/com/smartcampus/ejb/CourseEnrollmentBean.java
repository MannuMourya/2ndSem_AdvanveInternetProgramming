package com.smartcampus.ejb;

import javax.ejb.Stateless;

@Stateless
public class CourseEnrollmentBean {

    public String enrollStudent(Long studentId, Long courseId) {
        // Business logic for enrolling a student in a course.
        return "Student with ID " + studentId + " enrolled in course " + courseId;
    }
}

