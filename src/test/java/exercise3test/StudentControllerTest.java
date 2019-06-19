package exercise3test;
import exercise3.Student;
import exercise3.StudentController;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentControllerTest {
    private static Student student2=Student.StudentBuilder.newStudentBuilder()
            .setId(1).setFirstName("Nhi").setLastName("Nguyen")
            .setBirthday(new Date("06/02/1997"))
            .setClassName("15T3").setAddress("Da Nang").build();

    private static Student student1=Student.StudentBuilder.newStudentBuilder()
            .setId(2).setFirstName("Thu").setLastName("Nguyen")
            .setBirthday(new Date("29/01/1997"))
            .setClassName("15T3").setAddress("Da Nang").build();

    @Test
    public void test_addStudent(){
        StudentController studentController=new StudentController();
        Assert.assertNull(null);
        studentController.addStudent(student1);
        studentController.addStudent(student2);
        Assert.assertEquals(studentController.getStudents().size(),2);
    }

//    @Test
//    public void test_deleteStudent(){
//        StudentController studentController=new StudentController();
//        int len=studentController.getStudents().size();
//        Assert.assertNull(null);
//        studentController.addStudent(student);
//        Assert.assertEquals(studentController.getStudents().size(),len + 1);
//    }

}
