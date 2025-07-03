package Extra;

import Day6.CharacterArray;

public class One {

    public static void main(String[] args) {

        String[] name = {"satara", "pune","mumbai","delhi"};

        System.out.println("String lengths :");
        for(int i=0;i<name.length;i++){
            char[] ch = name[i].toCharArray();
            int len = 0;
            for(int j=0;j<ch.length;j++){
                len++;
            }
            System.out.println(len);
        }
        System.out.println();

        System.out.println("String reversed :");
        for(int i=0;i<name.length;i++){
            System.out.println(reverseString(name[i]));
        }
        System.out.println();

        System.out.println("String sorted: ");
        for(int i=0;i<name.length;i++){
            char[] ch = name[i].toCharArray();
            CharacterArray.bubblesort(ch);
            String str = new String(ch);
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Capitalised: ");
        for(int i=0;i<name.length;i++){
            char[] ch = name[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                char x = 'A';
                for(char k = 'a'; k < ch[j];k++){
                    x++;
                }
                ch[j] = x;
            }
            String str = new String(ch);
            System.out.println(str);
        }


    }

    public static String reverseString(String s){

        char[] chars = s.toCharArray();
        ReverseCharArray(chars);

        String text = new String(chars);
        return text;
    }

    public static void ReverseCharArray(char[] chars) {
        for(int i=0;i<chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
    }


}