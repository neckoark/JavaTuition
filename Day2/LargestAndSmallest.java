public class LargestAndSmallest {
        public static void main(String[] args) {
                int[] a = { 2, 3, 4, 6, 7, 121, 15, 10, 145 };
                sort(a);
                System.out.println("Sorted array : ");
                for (int i : a) {
                        System.out.print(i + " ");
                }

                System.out.println();

                System.out.println("Smallest : " + a[0]);
                System.out.println("Largest : " + a[a.length - 1]);

                System.out.println("Reverse sorted array is : ");
                for (int i = a.length - 1; i >= 0; i--) {
                        System.out.print(a[i] + " ");
                }
        }

        public static void sort(int[] data) {
                for (int i = 0; i < data.length - 1; i++) {
                        int smallest = i;

                        for (int index = i + 1; index < data.length; index++) {
                                if (data[index] < data[smallest]) {
                                        smallest = index;
                                }
                        }
                        swap(data, i, smallest);
                }
        }

        public static void swap(int[] data, int first, int second) {
                int temp = data[first];
                data[first] = data[second];
                data[second] = temp;
        }
}
