package PATTERNS;

/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
 */

public class Q2 {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j = i ; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 0 ; i < n ; i++ ){
            for(int j = n - i; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
