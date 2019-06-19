package exercise3;

import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private static List<Student> students=new ArrayList<>();
    private static File file =new File("D:\\test.json");

    public static List<Student> getStudents() {
        return students;
    }

    public static File getFile() {
        return file;
    }

    public static void addStudent(Student student){
        students.add(student);
        saveToFile();
    }

    public static boolean deleteStudent(Student student){
        if(students.size()==0){
            return false;
        }
        students.remove(student);
        saveToFile();
        return true;
    }

    public static void saveToFile(){
        Gson json=new Gson();
         List<String> temp=new ArrayList<>();
        for(Student stu:students){
            String studentJson=json.toJson(stu);
            System.out.println(studentJson);
            temp.add(studentJson);
        }
        //WriteReadFile.;
    }

    public static List<Student> loadFromFile(){
        return WriteReadFile.readFile(file);
    }

    public static Student getById(int id){
        for(Student stu:students){
            if(stu.getId()==id){
                return stu;
            }
        }
        return null;
    }

    public static List<Student> findByName(String firstName){
        List<Student> result=new ArrayList<>();
        for(Student stu:students){
            if(stu.getFirstName().equals(firstName)){
                result.add(stu);
            }
        }
        return result;
    }

    public static List<Student> findByClass(String className){
        List<Student> result=new ArrayList<>();
        for(Student stu:students){
            if(stu.getClassName().equals(className)){
                result.add(stu);
            }
        }
        return result;
    }

}
