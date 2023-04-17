package sem1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter values for search: ");
        int values = in.nextInt();
        int[] arr = new int[]{13, 31434, 1341, 41334, 51, 1535, 134};
        int res = GetIndexValue(arr, values);
        ShowResult(res);
    }

    public static int GetIndexValue(int[] arr, int value) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 1) {
            return -1;
        }

        for (int n = 0; n < arr.length; n ++) {
            if (arr[n] == value) {
                return n;
            }
        }
        return -2;
    }

    public static void ShowResult(int res) {
        if (res == -1) {
            System.out.println("Length of array less minimal size");
        }
        if (res == -2) {
            System.out.println("Unfind value");
        }
        if (res == -3) {
            System.out.println("Array is null");
        }
        if (res >= 0) {
            System.out.println("Index of value equals: " + res);
        }
    }
}
