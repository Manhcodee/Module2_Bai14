public class BubbleSortReverse {
    public static void main(String[] args) {
        double[] list = {5,6,7,2,1,98,36,54,74};
        reverse(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }

    public static void reverse(double[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                double temp = list[j];
                if (list[j] < list[j + 1]) {
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
