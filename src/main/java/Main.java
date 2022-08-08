import Compar.Int_Comparator_Student;
import Compar.Int_Comparator_Universitet;
import IO.ExcelWork;
import MODEL.Student;
import MODEL.University;
import enums.StudentComparatorType;
import enums.UniversityComparatorType;
import util.ComparatorUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String file_path = ".\\src\\main\\resources\\universityInfo.xlsx";
        String excel_list_universities = "Universities";
        String excel_list_students = "Students";

        /*создаем коллекции экземпляров объектов MODEL.University
        создаем объект класса для чтения данных из файла и открываем поток вывода
        вызываем функцию чтения с перезагрузкой метода под университет
        передаем Лист в функцию для заполнения его экземплярами объектов
        выводим полученный результат
         */

        List<University> universities = new ArrayList<>();
        ExcelWork univer_stream = new ExcelWork(file_path, excel_list_universities);
        univer_stream.readEcxel_universities(universities);
        //System.out.printf("LIST UNIVERSITIES: \n" + universities.toString());

        //вызов компоратора
        Int_Comparator_Universitet universityComparator =
                ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEAR);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);


        //делаем все тоже самое, только для студентов
        List<Student> students = new ArrayList<>();
        ExcelWork student_stream = new ExcelWork(file_path, excel_list_students);
        student_stream.readEcxel_students(students);
        //System.out.printf("LIST STUDENT: \n" + students.toString());


        //вызов компоратора
        Int_Comparator_Student studentComparator =
                ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}