package Compar;

import MODEL.Student;

public class StudentAvgExamScoreComparator implements Int_Comparator_Student{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }
}
