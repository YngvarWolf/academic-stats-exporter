package org.example.util;

import org.example.comparator.StudentComparator;
import org.example.comparator.UniversityComparator;
import org.example.comparator.student.*;
import org.example.comparator.university.*;
import org.example.enums.StudentComparatorType;
import org.example.enums.UniversityComparatorType;

public final class ComparatorUtil {

    private ComparatorUtil() {}

    public static StudentComparator getStudentComparator(StudentComparatorType type) {
        return switch (type) {
            case FULL_NAME -> new StudentFullNameComparator();
            case UNIVERSITY_ID -> new StudentUniversityIdComparator();
            case COURSE_NUMBER -> new StudentCourseNumberComparator();
            case AVG_EXAM_SCORE -> new StudentAvgExamScoreComparator();
        };
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType type) {
        return switch (type) {
            case ID -> new UniversityIdComparator();
            case FULL_NAME -> new UniversityFullNameComparator();
            case YEAR_OF_FOUNDATION -> new UniversityYearComparator();
        };
    }
}