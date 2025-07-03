package PracticeQuestions;

/*
3) Write a java program or function to check Harshad number (or Niven number). Your program
should take one positive integer from the user as input and check whether this integer is Harshad
number (Niven number) or not.Harshad number or Niven number is a number which is divisible by
the sum of its digits. For example,21 is a Harshad number because it is divisible by the sum of its
digits.21 –> sum of digits –> 2+1 = 3 and 21 is divisible by 3 –> 21/3 = 7
 */

public class P8 {
    public static void main(String[] args) {

        int n = 21;
        if(n % SOD(n) == 0) System.out.println("YES");
        else System.out.println("NO");
    }


    static int SOD(int n){
        int a = n;
        int b = n;
        int sum = 0;
        while(a != 0){
            a = a - a%10;
            sum = sum + b - a;
            a = a/10;
            b = b/10;
        }
        return sum;
    }
}
