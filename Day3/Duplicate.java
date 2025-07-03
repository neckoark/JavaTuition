package Day3;

public class Duplicate {
    public static void main(String[] args) {

        int[] a = { 2, 1, 2, 3, 1, 2, 3, 4 };
        int[] b = bubblesort(a);
        int size = a.length;
        int i, j, k;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    for (k = j; k < size - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    size--;
                }
                j--;
            }
        }

        printArray(a);

    }

    public static int countDuplicate(int[] data, int check) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == check) {
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static int[] bubblesort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }

        return data;
    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

}
