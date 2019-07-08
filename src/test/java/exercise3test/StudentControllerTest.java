package exercise3test;

import exercise3.Student;
import exercise3.StudentController;
import exercise3.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class StudentControllerTest {
    private static File file_origin = new File("student.json");
    private static File file_temp = new File("temp.json");

    @Test
    public void test_addStudent() throws IOException {
        StudentController sc = new StudentController("temp.json");

        int lengthBefore = sc.getStudents().size();

        Student.StudentBuilder sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112");

        sc.addStudent(sb.build());
        sc.addStudent(sb
                .setId(2)
                .build());

        Assert.assertEquals(sc.getStudents().size(), lengthBefore + 2);
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
        List<Student> students = FileUtils.readJsonFile(file_temp, Student[].class);
        FileUtils.writeToJsonFile(file_origin, students);
        assertTrue(file_temp.delete());
    }
}

