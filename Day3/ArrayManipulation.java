package Day3;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 9, 7, 1, 8, 6 };
        int[] even_array = new int[evenCount(a)];
        int[] odd_array = new int[oddCount(a)];
        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even_array[j] = a[i];
                j++;
            } else {
                odd_array[k] = a[i];
                k++;
            }
        }

        // Q1
        bubblesort(odd_array);
        bubblesort(even_array);
        printArray(mergeArray(odd_array, even_array));

        System.out.println();

        // Q2
        bubblesortReverse(even_array);
        bubblesort(odd_array);
        printArray(mergeArray(even_array, odd_array));

        System.out.println();

        // Q3
        bubblesort(even_array);
        bubblesortReverse(odd_array);
        printArray(mergeArray(even_array, odd_array));

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

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int newlength = arr1.length + arr2.length;

        int[] newarray = new int[newlength];

        System.arraycopy(arr1, 0, newarray, 0, arr1.length);

        System.arraycopy(arr2, 0, newarray, 0 + arr1.length, arr2.length);

        return newarray;
    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

    public static int evenCount(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int oddCount(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}