// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// По коду ниже вроде все возможные исключения поднял, но при изменении способа получение массива или индекса,
// можно будет добавить исключения, например: не найден файл, ошибка чтения файла


package sem1.homeworks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter index of element (from 0 to 9): ");
        String first = in.nextLine();
        int ind = CheckValueIndex(first);
        CheckRangeIndex(ind);
        int[] arr = new int[]{1, 2, 3, 4, 34, 341, 35134, 12351, 35135, 123};
        System.out.println("Values with index " + ind + " equals: " + GetValueFromArray(arr, ind));
    }

    public static int CheckValueIndex(String value) {
        if (!value.matches("-?\\d+")) {
            throw new RuntimeException("Invalid values for index");
        }
        return Integer.parseInt(value);
    }

    public static void CheckRangeIndex(int index) {
        if (index > 9) {
            throw new RuntimeException("Index greater than 9");
        }
        if (index < 0) {
            throw new RuntimeException("Index less than 0");
        }
    }

    public static int GetValueFromArray(int[] arr, int index) {
        if (arr == null || arr.length < 1) {
            throw new RuntimeException("Array is empty or null");
        }
        if (arr.length > 10) {
            throw new RuntimeException("Array is greater than 10");
        }
        return arr[index];
    }
}
