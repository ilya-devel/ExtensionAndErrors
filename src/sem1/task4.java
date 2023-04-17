package sem1;

public class task4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1,0}, {1, 0}};
        int res = GetSummaryElementsInArray(arr);

    }

    public static int GetSummaryElementsInArray(int[][] arr) {
        if (arr == null || arr[0].length != arr[1].length) return -1;
        int sum = 0;
        for (int[] ar : arr) {
            for (int n : ar) {
                if (n == 0 || n == 1) {
                    sum = sum + n;
                }
                else {
                    return -2;
                }
            }
        }
        return sum;
    }
}
