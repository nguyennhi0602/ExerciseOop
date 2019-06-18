package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeReadFile {
    private static void writeFile(File file,String row) {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(file);
            bw=new BufferedWriter(fw);
            bw.write(row);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
