package exercise3;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {

    private static Gson gson = new Gson();

    public static <T> List<T> readJsonFile(File jsonFile, Class<T[]> clazz) throws IOException {
        FileReader fileReader = new FileReader(jsonFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String row;
        StringBuilder json = new StringBuilder();
        while ((row = bufferedReader.readLine()) != null) {
            json.append(row);
        }
        T[] arr = gson.fromJson(json.toString(), clazz);
        List<T> objects = new ArrayList<>(Arrays.asList(arr));
        bufferedReader.close();
        fileReader.close();
        return objects;
    }

    public static <T> void writeToJsonFile(File file, List<T> objects) throws IOException {
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String json = gson.toJson(objects);
        bufferedWriter.append(json);
        bufferedWriter.close();
        fileWriter.close();
    }
}
