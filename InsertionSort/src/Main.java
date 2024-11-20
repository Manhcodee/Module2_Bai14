import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println("Bước " + i + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        scanner.close();
    }
}