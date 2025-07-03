package STRINGS;

public class Pattern {
    public static void main(String[] args) {

        int[]  a = {3,4,9,8,10};
        for(int i=0;i<a.length;i++){
            System.out.print((a[i]+i) + " ");
        }
        System.out.println();

        for(int x:a){
            if(x%2==0){
                System.out.print(x+" ");
            }
        }
        System.out.println();

        for(int x:a){
            if(x%2!=0){
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }
}
