// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package sem2.homeworks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String tmp = GetString();
        System.out.println("Вы ввели: " + tmp);
    }

    public static String CheckString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите не пустую строку: ");
        String str = in.nextLine();
        if (str.strip().equals("")) {
            throw new RuntimeException("Вы ввели пустую строку, попробуйте ещё раз");
        }
        return str;
    }

    public static String GetString() {
        try {
            return CheckString();
        } catch (Exception err) {
            System.out.println(err.getMessage());
            return GetString();
        }
    }
}
