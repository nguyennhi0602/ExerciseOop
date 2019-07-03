package exercise3test;

import exercise3.Student;
import exercise3.StudentController;
import exercise3.WriteReadFile;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentControllerTest {
    private static List<Student> students;
    private static File file_origin = new File("student.json");
    private static File file_temp = new File("temp.json");
//
//    @BeforeClass
//    public static void setup() {
//        file_temp = new File("student.json");
//        file_origin = new File("temp.json");
//
//        if (!file_origin.exists()) {
//            try {
//                file_origin.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        List<Student> students;
//
//        try {
//            students = WriteReadFile.readJsonFile(file_temp, Student[].class);
//            WriteReadFile.writeToJsonFile(file_origin, students);
//        } catch (IOException ignored) {
//        }
//
//    }


    @Test
    public void test_addStudent() throws IOException {
        StudentController sc = new StudentController("temp.json");

        int default_length = sc.getStudents().size();

        sc.addStudent(Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112")
                .build());
        sc.addStudent(Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(2)
                .setFirstName("Nhi")
                .setLastName("Nguyen")
                .setClassName("112")
                .build());
        System.out.println(default_length);
        Assert.assertEquals(sc.getStudents().size(), default_length + 2);
    }

    @Test
    public void test_getById() throws IOException {
        StudentController sc = new StudentController("temp.json");
        Assert.assertNull(sc.getById(7));
    }

    @Test
    public void test_deleteStudent() throws IOException {
        StudentController sc = new StudentController("temp.json");
        int length = sc.getStudents().size();
        sc.deleteStudent(1);
        Assert.assertEquals(sc.getStudents().size(), length - 1);
    }

    @Test
    public void test_loadFromFile() throws IOException {
        StudentController sc = new StudentController("temp.json");
        Assert.assertNotNull(sc.loadFromFile());
    }

    @Test
    public void test_findByName() throws IOException {
        StudentController sc = new StudentController("temp.json");
        Assert.assertNotNull(sc.findByName("nhi"));
    }

    @Test
    public void test_findByClass() throws IOException {
        StudentController sc = new StudentController("temp.json");
        Assert.assertNotNull(sc.findByClass("15T3"));
    }

    @AfterClass
    public static void finalized() throws Exception {
        students = WriteReadFile.readJsonFile(file_temp, Student[].class);
        WriteReadFile.writeToJsonFile(file_origin, students);
        file_temp.delete();
    }
}

