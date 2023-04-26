package sem3.homeworks.controlApp;

import sem3.homeworks.appClass.Person;
import sem3.homeworks.appExceptions.CopyStringException;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void RecData(Person data) {
        String fileName = data.getSurname() + ".csv";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("[INFO] Создан новый файл для фамилии " + data.getSurname());
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bfWriter = new BufferedWriter(writer);
             Scanner reader = new Scanner(new File(fileName))) {
            reader.useDelimiter("\n");
            while (reader.hasNext()) {
                if (reader.next().equals(data.toString().strip())) {
                    throw new CopyStringException();
                }
            }
            bfWriter.write(data.toString());


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println("[INFO] Запись завершена");
    }
}
