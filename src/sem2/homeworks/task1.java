// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package sem2.homeworks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float tmp = GetFloatValue();
        System.out.println("Вы ввели: " + tmp);
    }

    public static float StringToFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число (через запятую, если локаль русская): ");
        return in.nextFloat();
    }

    public static float GetFloatValue() {
        try {
            return StringToFloat();
        } catch (Exception err) {
            System.out.println("Указаны не корректные данные, попробуйте ещё раз");
            return GetFloatValue();
        }
    }
}
