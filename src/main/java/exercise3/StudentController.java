package exercise3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private static List<Student> students=new ArrayList<>();
    private static File file =new File("D:\\test.json");

    public StudentController(String filePath) {
        file = new File(filePath);
        loadFromFile();
    }
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

    public static boolean deleteStudent(int id) {
        boolean result = students.removeIf(o -> o.getId() == id);
        saveToFile();
        return result;
    }

    public static void saveToFile(){
        try {
            WriteReadFile.writeToJsonFile(file, students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> loadFromFile(){
        try {
            students = WriteReadFile.readJsonFile(file, Student[].class);
        } catch (IOException e) {
        }
        return students;
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
