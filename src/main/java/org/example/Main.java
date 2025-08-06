package org.example;

import org.example.model.Student;
import org.example.model.StudyProfile;
import org.example.model.University;
import org.example.model.Statistics;
import org.example.util.ComparatorUtil;
import org.example.util.StatisticsUtil;
import org.example.util.XlsWriter;

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

        var statisticsList = StatisticsUtil.collectStatistics(students, universities);

        System.out.println("Статистика:");
        statisticsList.forEach(System.out::println);

        XlsWriter.writeStatisticsToXls(statisticsList, "statistics.xlsx");
        System.out.println("Файл statistics.xlsx успешно создан.");
    }
}