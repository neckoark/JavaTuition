package ExampleProblems;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		int input = -1;
		while(input == -1){
			Scanner scanner = new Scanner(System.in);

			System.out.println("--------Enter Option---------");
			System.out.println("Add : 1");
			System.out.println("Subtract : 2");
			System.out.println("Multiply : 3");
			System.out.println("Quit : 0");
			System.out.println("-----------------------------");

			int opt = scanner.nextInt();

			if(opt == 1){
				add();
			}
			else if(opt == 2){
				subtract();
			}
			else if(opt == 3){
				multiply();
			}
			else{
				input = 0;
			}


		}
	}

	static void add(){

		System.out.println("Enter two numbers: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Addition : " + (a + b));
	}
	static void subtract(){

		System.out.println("Enter two numbers: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Subtraction : " + (a - b));
	}
	static void multiply(){

		System.out.println("Enter two numbers: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Multiplication : " + (a * b));
	}

}



// OOPs - 4
// Method - 4
// Constructor -