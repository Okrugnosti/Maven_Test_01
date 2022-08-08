package util;

import Compar.*;
import enums.StudentComparatorType;
import enums.UniversityComparatorType;

public class ComparatorUtil {

    private ComparatorUtil() {
    }

    public static Int_Comparator_Student getStudentComparator(StudentComparatorType studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                //noinspection DuplicateBranchesInSwitch
                return new StudentFullNameComparator();
            case COURSE:
                return new StudentCourseComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static Int_Comparator_Universitet getUniversityComparator(UniversityComparatorType universityComparatorType) {

        switch (universityComparatorType) {

            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                //noinspection DuplicateBranchesInSwitch
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case PROFILE:
                return new UniversityProfileComparator();
            case YEAR:
                return new UniversityYearComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}