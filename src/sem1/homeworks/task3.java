// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности
// элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

package sem1.homeworks;

public class task3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5, 6};
        int[] arr2 = new int[]{3, 4, 9, 8, 1};
        try {
            int[] resArr = SummaryArray(arr1, arr2);
            for (int n : resArr) {
                System.out.println(n);
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }

    public static int[] SummaryArray(int[] ar1, int[] ar2) {
        if (ar1 == null || ar2 == null || ar1.length < 1 || ar2.length < 1 ) {
            throw new RuntimeException("One of the passed arrays is empty or null");
        }
        if (ar1.length != ar2.length) {
            throw new RuntimeException("Arrays lengths is not equal");
        }

        int[] res = new int[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            res[i] = ar1[i] - ar2[i];
        }
        return res;
    }
}
