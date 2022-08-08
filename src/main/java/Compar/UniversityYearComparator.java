package Compar;

import MODEL.University;

public class UniversityYearComparator implements Int_Comparator_Universitet{
    @Override
    public int compare(University o1, University o2) {
        return Double.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}