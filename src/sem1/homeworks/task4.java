// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше

package sem1.homeworks;

public class task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5, 6};
        int[] arr2 = new int[]{3, 4, 9, 8, 1};
        try {
            double[] resArr = SummaryArray(arr1, arr2);
            for (double n : resArr) {
                System.out.printf("%.2f\n", n);
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    public static double[] SummaryArray(int[] ar1, int[] ar2) {
        if (ar1 == null || ar2 == null || ar1.length < 1 || ar2.length < 1) {
            throw new RuntimeException("One of the passed arrays is empty or null");
        }
        if (ar1.length != ar2.length) {
            throw new RuntimeException("Arrays lengths is not equal");
        }
        double[] res = new double[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            res[i] = (double) ar1[i] / (double) ar2[i];
        }
        return res;
    }
}
