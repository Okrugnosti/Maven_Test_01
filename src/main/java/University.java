public class University {
    String id, fullName, abbreviation, studyProfile;
    double yearOfFoundation;
    //StudyProfile mainProfile;

    public University() {
    }

    public University(String id, String fullName, String abbreviation, double yearOfFoundation, String studyProfile) {
        this.id = id;
        this.fullName = fullName;
        this.abbreviation = abbreviation;
        this.yearOfFoundation = yearOfFoundation;
        this.studyProfile = studyProfile;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setStudyProfile(String studyProfile) {
        this.studyProfile = studyProfile;
    }

    public void setYearOfFoundation(double yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString(){
        return  "\n"  +
                "ID: " + id + "\n" +
                "fullName: " + fullName + "\n" +
                "abbreviation: " + abbreviation + "\n" +
                "yearOfFoundation: " + yearOfFoundation + "\n" +
                "Study_Profile: " + studyProfile + "\n";
                // + "Main_Profile :" + mainProfile + "\n\n";
    }

}
