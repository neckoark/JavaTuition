package PATTERNS;

/*
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
 */
public class Q3 {
    public static void main(String[] args) {

        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i%2 != 0 && j%2 == 0) {
                    System.out.print(0+" ");
                } else if(i%2 == 0 && j%2 != 0) {
                    System.out.print(0+" ");
                } else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
