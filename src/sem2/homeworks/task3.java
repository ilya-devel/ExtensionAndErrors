// Дан следующий код, исправьте его там, где требуется (задание 3

package sem2.homeworks;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[]{1, 2};
//            int[] abc = null;
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}

// Убрал throws FileNotFoundException
// Переместил catch (Throwable ex) в конец
// NullPointerException лишний, т.к. массив прописываем вручную, но оставил, если заменить на null, данное исключение отработает