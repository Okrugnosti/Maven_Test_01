package Compar;

import MODEL.Student;

public class StudentCourseComparator implements Int_Comparator_Student{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
