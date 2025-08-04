package org.example.model;

public enum StudyProfile {
    ENGINEERING("Инженерия"),
    MEDICINE("Медицина"),
    ECONOMICS("Экономика"),
    COMPUTER_SCIENCE("Информатика"),
    LINGUISTICS("Лингвистика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return profileName;
    }
}