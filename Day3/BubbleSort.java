package Day3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 8, 1, 9 };

        bubblesort(a);

        printArray(a);
        System.out.println();

        bubblesortReverse(a);

        printArray(a);

      System.out.println();
    }

    public static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static void bubblesort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
    }

    public static void bubblesortReverse(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] < data[j]) {
                    swap(data, i, j);
                }
            }
        }
    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
