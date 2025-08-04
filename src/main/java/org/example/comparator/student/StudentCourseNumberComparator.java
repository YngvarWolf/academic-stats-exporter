package org.example.comparator.student;

import org.example.comparator.StudentComparator;
import org.example.model.Student;

public class StudentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCurrentCourseNumber(), s2.getCurrentCourseNumber());
    }
}