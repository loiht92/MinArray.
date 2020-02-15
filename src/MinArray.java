public class MinArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 7, 3, 6, 8};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }

    public static int minValue(int[] array) { // dau tien la kiem tra vi tri gia tri nho nhat trong mang//
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
