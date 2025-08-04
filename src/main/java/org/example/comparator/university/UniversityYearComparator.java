package org.example.comparator.university;

import org.example.comparator.UniversityComparator;
import org.example.model.University;

public class UniversityYearComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return Integer.compare(u1.getYearOfFoundation(), u2.getYearOfFoundation());
    }
}