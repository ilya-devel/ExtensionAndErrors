package sem1;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {};
        System.out.println(ShowArray(arr));

    }

    public static int ShowArray(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        return arr.length;
    }
}