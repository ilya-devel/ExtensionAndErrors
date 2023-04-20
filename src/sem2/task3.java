package sem2;

import java.io.*;
import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> names = GetLengthOfName("./src/sem2/name.txt");
        for (String key: names.keySet()) {
            System.out.println( key + " " + names.get(key));
        }
    }

    public static HashMap<String, Integer> GetLengthOfName(String path) {
        HashMap<String, Integer> names = new HashMap<>();
        BufferedReader file;
        try {
            file = new BufferedReader(new FileReader(path));
            String line = file.readLine();
            while (line != null) {
                String[] row = line.split("=");
                    try {
                        int l = Integer.parseInt(row[1]);
                        names.put(row[0], l);
                    } catch (Exception err) {
                        names.put(row[0], row[0].length());
                    }
                line = file.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return names;
    }
}
