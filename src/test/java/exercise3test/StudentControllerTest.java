package exercise3test;

import exercise3.Student;
import exercise3.StudentController;
import exercise3.WriteReadFile;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentControllerTest {
    private static List<Student> students;
    private static File file_origin = new File("students.json");
    private static File file_temp = new File("temp.json");

    @Test
    public void test_addStudent() {
        StudentController sc = new StudentController("temp.json");

        int default_length = sc.getStudents().size();

        sc.addStudent(Student.StudentBuilder.newStudentBuilder().setId(1).setFirstName("Hau").setLastName("Bui").setClassName("112").build());
        sc.addStudent(Student.StudentBuilder.newStudentBuilder().setId(2).setFirstName("Nhi").setLastName("Nguyen").setClassName("112").build());
        System.out.println(default_length);
        Assert.assertEquals(sc.getStudents().size(), default_length + 2);
    }

    @Test
    public void test_getById() {
        StudentController sc = new StudentController("students.json");
        Assert.assertNotNull(sc.getById(2));
        Assert.assertNull(sc.getById(5));
    }

    @Test
    public void test_deleteStudent() {
        StudentController sc = new StudentController("students.json");
        Assert.assertFalse(sc.deleteStudent(38));
    }

    @Test
    public void test_loadFromFile() {
        StudentController sc = new StudentController("students.json");
        Assert.assertNotNull(sc.loadFromFile());
    }

    @Test
    public void test_findByName() {
        StudentController sc = new StudentController("students.json");
        Assert.assertNotNull(sc.findByName("nhi"));
    }

    @Test
    public void test_findByClass() {
        StudentController sc = new StudentController("students.json");
        Assert.assertNotNull(sc.findByClass("15T3"));
    }

    @AfterClass
    public static void finalized() {
        try {
            students = WriteReadFile.readJsonFile(file_temp, Student[].class);
            WriteReadFile.writeToJsonFile(file_origin, students);
        } catch (IOException e) {
        }
        file_temp.delete();
    }
}

