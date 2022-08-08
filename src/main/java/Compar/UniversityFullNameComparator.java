package Compar;

import MODEL.University;
import org.apache.commons.lang3.StringUtils;


public class UniversityFullNameComparator implements Int_Comparator_Universitet{

    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}