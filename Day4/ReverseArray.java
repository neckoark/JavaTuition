package Day4;

import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = { 2, 3, 17, 1, 2, 5, 4 };
        int[] b = a;
        // o/p - 17,5,4

        /* for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
        
                if (a[j] > a[i]) {
                    break;
                } else {
                    System.out.print(a[i] + " ");
                    break;
                }
        
            }
        
            if (i == a.length - 1) {
                System.out.println(a[i]);
            }
        }
        
        System.out.println(); */

        // o/p - 2,3,1,2 => If any number j found to be greater than i, print i
        /* for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
        
                if (a[j] > a[i]) {
                    System.out.println(a[i]);
                    break;
                }
        
            }
        } */

        for (int i = 0; i < a.length / 2; i++) {
            /* System.out.println(a[i]);
            System.out.println(a[(a.length - 1) - i]); */
            int temp = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1 - i)] = temp;
            /* swapNums(b[i], a[(a.length - 1) - i]); */
        }

        for (int x : a) {
            System.out.println(x);
        }

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

    public static int countOf(int[] data, int num) {
        int count = 0;

        for (int i = 0; i < data.length; i++) {

        }

        return count;
    }

}