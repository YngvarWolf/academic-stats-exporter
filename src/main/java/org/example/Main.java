package org.example;

import org.example.comparator.StudentComparator;
import org.example.comparator.UniversityComparator;
import org.example.enums.StudentComparatorType;
import org.example.enums.UniversityComparatorType;
import org.example.model.Student;
import org.example.model.StudyProfile;
import org.example.model.University;
import org.example.util.ComparatorUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Иван Иванов", "UNI001", 3, 4.5f),
                new Student("Алексей Смирнов", "UNI001", 2, 4.8f),
                new Student("Мария Петрова", "UNI002", 4, 3.9f)
        );

        List<University> universities = List.of(
                new University("UNI001", "МГУ", "МГУ", 1755, StudyProfile.COMPUTER_SCIENCE),
                new University("UNI002", "СПбГУ", "СПбГУ", 1819, StudyProfile.ECONOMICS)
        );

        StudentComparator studentComparator = ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);
        UniversityComparator universityComparator = ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEAR_OF_FOUNDATION);

        System.out.println("Сортированные студенты по среднему баллу (по убыванию):");
        students.stream().sorted(studentComparator).forEach(System.out::println);

        System.out.println("\nСортированные университеты по году основания:");
        universities.stream().sorted(universityComparator).forEach(System.out::println);
    }
}
