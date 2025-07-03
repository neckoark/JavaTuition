package STRINGS;

public class Test {
    public static void main(String[] args) {

        char[] city = {'P','u','N','e'};
        String s = "Satara";
        String message = "Hello " + s;
        System.out.println(message);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                System.out.print(s.charAt(i));
            }
        }

//        for (int i = 0; i < city.length; i++) {
//            if(city[i]>='A' && city[i]<='Z' ){
//                System.out.println(city[i]);
//            }
//        }
    }
}
