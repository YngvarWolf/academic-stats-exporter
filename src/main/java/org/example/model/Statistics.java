package org.example.model;

import java.util.List;

public class Statistics {
    private StudyProfile studyProfile;
    private double avgExamScore;
    private int studentCount;
    private int universityCount;
    private List<String> universityNames;

    public Statistics(StudyProfile studyProfile, double avgExamScore, int studentCount,
                      int universityCount, List<String> universityNames) {
        this.studyProfile = studyProfile;
        this.avgExamScore = avgExamScore;
        this.studentCount = studentCount;
        this.universityCount = universityCount;
        this.universityNames = universityNames;
    }

    public StudyProfile getStudyProfile() { return studyProfile; }
    public double getAvgExamScore() { return avgExamScore; }
    public int getStudentCount() { return studentCount; }
    public int getUniversityCount() { return universityCount; }
    public List<String> getUniversityNames() { return universityNames; }

    public void setStudyProfile(StudyProfile studyProfile) { this.studyProfile = studyProfile; }
    public void setAvgExamScore(double avgExamScore) { this.avgExamScore = avgExamScore; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }
    public void setUniversityCount(int universityCount) { this.universityCount = universityCount; }
    public void setUniversityNames(List<String> universityNames) { this.universityNames = universityNames; }

    @Override
    public String toString() {
        return "Statistics{" +
                "studyProfile=" + studyProfile +
                ", avgExamScore=" + avgExamScore +
                ", studentCount=" + studentCount +
                ", universityCount=" + universityCount +
                ", universityNames=" + universityNames +
                '}';
    }
}
