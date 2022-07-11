public class Main {

    public static void main(String[] args) {

        University spbgu = new University("SPBGU", "SPBGU",
                100, 4, StudyProfile.ANALIST);

        Student petr = new Student("Petr Ivanov", "SPBGU", 4, 4);

        System.out.printf(spbgu.toString());
        System.out.printf(petr.toString());
    }
}
