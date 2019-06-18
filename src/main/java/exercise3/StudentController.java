package exercise3;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private static List<Student> students=new ArrayList<>();
    public static List<Student> addStudent(Student student){
        students.add(student);
        return students;
    }

    public static List<Student> deleteStudent(Student student){
        if(students.size()==0){
            return null;
        }
        students.remove(student);
        return students;
    }

    public static void saveToFile(){

//         json=new Gson();
//        for(Student stu:students){
//            String json=
//        }
    }
}
