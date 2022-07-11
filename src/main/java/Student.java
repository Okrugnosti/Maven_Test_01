public class Student {

    String fullName, universityId;
    double currentCourseNumber;
    double avgExamScore;

    public Student() {
    }

    public Student(String fullName, String universityId, double currentCourseNumber, double avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public double getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(double currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return
                "\n" +
                        "Name :" + fullName + "\n" +
                        "University: " + universityId + "\n" +
                        "CourseNumber: " + currentCourseNumber + "\n" +
                        "avgExamScore :" + avgExamScore + "\n\n";
    }

}
