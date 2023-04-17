package sem1;

public class task8 {
    public static void main(String[] args) {
        System.out.println("");
    }

    public static int[] GetNewArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            throw new RuntimeException("Unvalid arrays");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }
}
