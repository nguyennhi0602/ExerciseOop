package exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentController {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(int id){
        for(int i=0;i<students.size();i++){
            Student stu=students.get(i);
            if(stu.getId()==id){
                students.remove(stu);
            }
        }
    }

    public void saveToFile(String path) throws IOException {
        FileUtils.writeToJsonFile(path, students);
    }

    public void loadFromFile(String path) throws IOException {
        students = FileUtils.readJsonFile(path, Student[].class);
    }

    public Student getById(int id) {
        for (Student stu : students) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

    public List<Student> findByName(String firstName) {
        List<Student> result = new ArrayList<>();
        for (Student stu : students) {
            if (stu.getFirstName().equals(firstName)) {
                result.add(stu);
            }
        }
        return result;
    }

    public List<Student> findByClass(String className) {
        List<Student> result = new ArrayList<>();
        for (Student stu : students) {
            if (stu.getClassName().equals(className)) {
                result.add(stu);
            }
        }
        return result;
    }

}
