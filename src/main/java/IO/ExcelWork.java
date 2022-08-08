package IO;

import MODEL.Student;
import MODEL.University;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWork {
/*
реализован класс с методами для чтения информации из файла
и сбора коллекций соответствующих экземпляров классов MODEL.Student и MODEL.University;
 */

    //File file = new File("C:\\0.MyFile\\Java_Project\\Maven_Gradle_01\\src\\main\\resources\\universityInfo.xlsx");
    String file_path, excel_list;

    public ExcelWork(String file_path, String excel_list) {
        this.file_path = file_path;
        this.excel_list = excel_list;
    }

    public void readEcxel_universities(List<University> universities) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file_path));
        XSSFSheet sheet = workbook.getSheet(excel_list);
        Iterator<Row> rowIterator = sheet.iterator();

        //пропускаем строку с заголовками
        Row row = rowIterator.next();

        //цикл считывания информации из файла
        while (rowIterator.hasNext()) {
            row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            System.out.printf("\n");

            while (cellIterator.hasNext()) {

                //создаем объем Universiti
                University un = new University();

                //id_university
                Cell cell = cellIterator.next();
                un.setId(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                //Full_Name
                cell = cellIterator.next();
                un.setFullName(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                //Abbreviation
                cell = cellIterator.next();
                un.setAbbreviation(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                //Year_of_foundation
                cell = cellIterator.next();
                un.setYearOfFoundation(cell.getNumericCellValue());
                //System.out.printf(cell.getNumericCellValue() + "\n");

                //Study_Profile
                cell = cellIterator.next();
                un.setStudyProfile(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                universities.add(un);

            }
        }
    }

    public void readEcxel_students(List<Student> students) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file_path));
        XSSFSheet sheet = workbook.getSheet(excel_list);
        Iterator<Row> rowIterator = sheet.iterator();

        //пропускаем строку с заголовками
        Row row = rowIterator.next();

        //цикл считывания информации из файла
        while (rowIterator.hasNext()) {
            row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            System.out.printf("\n");

            while (cellIterator.hasNext()) {

                //создаем объем Universiti
                Student st = new Student();

                //Full name
                Cell cell = cellIterator.next();
                st.setFullName(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                //id university
                cell = cellIterator.next();
                st.setUniversityId(cell.getStringCellValue());
                //System.out.printf(cell.getStringCellValue() + "\n");

                //Education course
                cell = cellIterator.next();
                st.setCurrentCourseNumber(cell.getNumericCellValue());
                //System.out.printf(cell.getNumericCellValue() + "\n");

                //Average score
                cell = cellIterator.next();
                st.setAvgExamScore(cell.getNumericCellValue());
                //System.out.printf(cell.getNumericCellValue() + "\n");

                students.add(st);

                /*
                if (cell.getCellTypeEnum() == STRING) {
                    System.out.printf(cell.getStringCellValue() + " s \n");
                }

                if (cell.getCellTypeEnum() == NUMERIC) {
                    System.out.printf(cell.c() + " n \n");
                }
                */

            }
        }




    }

}
