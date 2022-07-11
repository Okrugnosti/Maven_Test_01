public class University {

    String id, fullName, shortName;
    int yearOfFoundation, StudyProfile;
    StudyProfile mainProfile;

    public University(String id, String fullName, int yearOfFoundation, int studyProfile, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        StudyProfile = studyProfile;
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getStudyProfile() {
        return StudyProfile;
    }

    public void setStudyProfile(int studyProfile) {
        StudyProfile = studyProfile;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString(){
        return "ID :" + id + "\n" +
                "fullName :" + fullName + "\n" +
                "shortName :" + shortName + "\n" +
                "yearOfFoundation :" + yearOfFoundation + "\n" +
                "Study_Profile :" + StudyProfile + "\n" +
                "Main_Profile :" + mainProfile + "\n\n";
    }

}
