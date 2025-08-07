package org.example.util;

import org.example.model.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public final class StatisticsUtil {

    public static List<Statistics> collectStatistics(List<Student> students, List<University> universities) {

        Map<String, List<Student>> studentsByUniversityId = students.stream()
                .collect(Collectors.groupingBy(Student::getUniversityId));

        return universities.stream()
                .collect(Collectors.groupingBy(University::getMainProfile))
                .entrySet()
                .stream()
                .map(entry -> {
                    StudyProfile profile = entry.getKey();
                    List<University> universitiesForProfile = entry.getValue();

                    List<String> universityIds = universitiesForProfile.stream()
                            .map(University::getId)
                            .toList();

                    List<String> universityNames = universitiesForProfile.stream()
                            .map(University::getFullName)
                            .toList();

                    List<Student> studentsForProfile = universityIds.stream()
                            .flatMap(id -> studentsByUniversityId.getOrDefault(id, List.of()).stream())
                            .toList();

                    OptionalDouble avgScoreOpt = studentsForProfile.stream()
                            .mapToDouble(Student::getAvgExamScore)
                            .average();

                    double avgScore;
                    if (avgScoreOpt.isPresent()) {
                        avgScore = BigDecimal.valueOf(avgScoreOpt.getAsDouble())
                                .setScale(2, RoundingMode.HALF_UP)
                                .doubleValue();
                    } else {
                        avgScore = 0.0;
                    }

                    return new Statistics(
                            profile,
                            avgScore,
                            studentsForProfile.size(),
                            universitiesForProfile.size(),
                            universityNames
                    );
                })
                .toList();
    }
}
