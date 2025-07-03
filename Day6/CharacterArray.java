package Day6;

public class  CharacterArray {
    public static void main(String[] args) {

        char[] chararray = { 'A', 'c', 'D', 'E', 'b' };

        System.out.print("Upper case characters: ");
        for (char x : chararray) {
            if (Character.isUpperCase(x)) {
                System.out.print(x + " ");
            }
        }

        System.out.println();

        System.out.print("Lower case characters: ");
        for (char x : chararray) {
            if (Character.isLowerCase(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.print("All characters in Uppercase: ");
        for (char x : chararray) {
            System.out.print(Character.toUpperCase(x) + " ");
        }
        System.out.println();

        System.out.print("All ASCII values: ");
        for (char x : chararray) {
            System.out.println(x + " : " + (int) x);
        }
        System.out.println();

        System.out.println("Sorted Array: ");
        bubblesort(chararray);
        for (char i : chararray) {
            System.out.print(i + " ");
        }
        System.out.println();

        char[] chararray_dup = { 'A', 'c', 'D', 'E', 'b' };
        System.out.print("Reverse array: ");
        for (int i = 0; i < chararray_dup.length / 2; i++) {
            char temp = chararray_dup[i];
            chararray_dup[i] = chararray_dup[(chararray_dup.length - 1) - i];
            chararray_dup[(chararray_dup.length - 1 - i)] = temp;
        }
        for (char i : chararray_dup) {
            System.out.print(i + " ");
        }

    }

    public static char[] bubblesort(char[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
        return data;
    }

    public static void swap(char[] data, int first, int second) {
        char temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }
}
