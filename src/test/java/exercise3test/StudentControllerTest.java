package exercise3test;

import exercise3.Student;
import exercise3.StudentController;
import exercise3.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentControllerTest {
    private static String fileOrigin = "student.json";

    @Test
    public void test_getStudent(){
        Student sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112")
                .setAddress("da nang")
                .build();
        Assert.assertEquals(sb.getId(),1);
        Assert.assertEquals(sb.getFirstName(),"haha");
        Assert.assertEquals(sb.getAddress(),"da nang");
        Assert.assertEquals(sb.getLastName(),"Le");
        Assert.assertEquals(sb.getClassName(),"112");

    }
    @Test
    public void test_addStudent() throws IOException {
        StudentController sc = new StudentController();

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
        sc.saveToFile(fileOrigin);
    }

    @Test
    public void test_getById() throws IOException {
        StudentController sc = new StudentController();
        Student.StudentBuilder sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112")
                .setAddress("da nang");

        sc.addStudent(sb.build());
        sc.addStudent(sb
                .setId(2)
                .build());
        Assert.assertNull(sc.getById(7));
        Assert.assertNotNull(sc.getById(1));
    }

    @Test
    public void test_deleteStudent() throws IOException {
        StudentController sc = new StudentController();
        sc.deleteStudent(1);
        Assert.assertEquals(sc.getStudents().size(),0);
        Student.StudentBuilder sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112");

        sc.addStudent(sb.build());
        sc.deleteStudent(10);
        Assert.assertEquals(sc.getStudents().size(),1);
        sc.deleteStudent(1);
        Assert.assertEquals(sc.getStudents().size(),0);
        sc.saveToFile(fileOrigin);
    }

    @Test
    public void test_loadFromFile() throws IOException {
        StudentController sc = new StudentController();
        sc.loadFromFile(fileOrigin);
        assertEquals(sc.getStudents().size(), 2);
    }

    @Test
    public void test_findByName() throws IOException {
        StudentController sc = new StudentController();
        Student.StudentBuilder sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112");
        sc.addStudent(sb.build());
        Assert.assertNotNull(sc.findByName("haha"));
        List<Student> result=new ArrayList<>();
        Assert.assertEquals(sc.findByName("nu"),result);
    }
    @Test
    public void test_findByClass() throws IOException {
        StudentController sc = new StudentController();
        Student.StudentBuilder sb = Student
                .StudentBuilder
                .newStudentBuilder()
                .setId(1).setFirstName("haha")
                .setLastName("Le")
                .setClassName("112");
        sc.addStudent(sb.build());
        Assert.assertNotNull(sc.findByClass("112"));
        List<Student> result=new ArrayList<>();
        Assert.assertEquals(sc.findByClass("15T3"),result);
    }
}

