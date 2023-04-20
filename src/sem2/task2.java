package sem2;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {{"123", "asd", "13"}, {"2", "alkdjf", "s"}};
        System.out.println(Sum2D(arr));
    }

    public static int Sum2D(String[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Array is empty or null");
        }
        int sum = 0;
        for (String[] strings : arr) {
            for (String string : strings) {
                try {
                    int val = Integer.parseInt(string);
                    sum += val;
                } catch (NumberFormatException err) {
                    System.out.println(err.getMessage());
                }
            }
        }
        return sum;
    }
}
