// Если необходимо, исправьте данный код

package sem2.homeworks;

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 541, 51, 151, 2351, 13, 314, 1341};
        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }
}

// Были выполнены следующие правки:
// 1. добавлен intArray
// 2. явное приведение к типу double
// 3. Добавил исключения для выхода за пределы массива, и общий вывод об ошибке