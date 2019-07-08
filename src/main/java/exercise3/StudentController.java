package exercise3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<Student> students = new ArrayList<>();
    private File file = new File("D:\\test.json");

    public StudentController(String filePath) throws IOException {
        file = new File(filePath);
    }

    public List<Student> getStudents() {
        return students;
    }

    public File getFile() {
        return file;
    }

    public void addStudent(Student student) throws IOException {
        students.add(student);
        saveToFile();
    }

    public void deleteStudent(int id) throws IOException {
        for (Student stu : students) {
            if (stu.getId() == id) {
                students.remove(stu);
            }
        }
        saveToFile();
    }

    public void saveToFile() throws IOException {
        FileUtils.writeToJsonFile(file, students);
    }

    public List<Student> loadFromFile() throws IOException {
        students = FileUtils.readJsonFile(file, Student[].class);
        return students;
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
