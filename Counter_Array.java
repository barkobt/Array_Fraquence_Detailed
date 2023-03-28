import java.util.Arrays;

public class Counter_Array {
    static boolean isRepeat(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11, 5, 1, 2, 3, 3, 5, 5, 2, 1, 7};
        int count = 0;
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        System.out.println("TEKRAR EDEN SAYILAR:");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
                if (!isRepeat(duplicate, arr[i])) {
                    duplicate[startIndex++] = arr[i];
                    break;
                }
            }

            if (count > 1) System.out.println(arr[i] + " sayısı " + count + " defa tekrar edildi.");
            count = 0;
        }

    }
}
