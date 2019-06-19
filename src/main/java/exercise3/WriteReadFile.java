package exercise3;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {

    private static void writeFile(File file,List<String> students) {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(file);
            bw=new BufferedWriter(fw);
            for(String stu:students) {
                bw.write(stu);
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFile(File file){
        List<Student> students = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            Gson gson=new Gson();
            String row = "";
            while ((row = br.readLine()) != null) {
                Student student=gson.fromJson(row,Student.class);
                students.add(student);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
