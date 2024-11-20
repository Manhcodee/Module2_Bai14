
public class Main {
    public static void main(String[] args) {
        double[] list = {1,2,3,8,14,25,89,14,52,4};
        BubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
    public static void BubbleSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                double temp = list[j];
                if (list[j] > list[j + 1]) {
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}