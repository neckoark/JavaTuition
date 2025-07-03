package ExampleProblems;

import java.util.Scanner;

public class Account {

	static int acc_no;
	static String name;
	static float balance;

	static void insert(){
		System.out.println("Enter data to insert");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter balance");
		balance = sc.nextFloat();
		System.out.println("Enter acc_no");
		acc_no = sc.nextInt();
	}

	static void display(){
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Account no: " + acc_no);
	}

	static void deposit(){
		System.out.println("Enter amount to deposit");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		balance = balance + deposit;
	}

	static void withdraw(){
		System.out.println("Enter amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		balance = balance - withdraw;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = -1;
		while(option != 0){

			System.out.println("----------------");
			System.out.println("1: Insert");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw");
			System.out.println("4: Display");
			System.out.println("5: Exit");
			System.out.println("----------------");

			int opt = sc.nextInt();

			if(opt == 1){
				insert();
			}
			else if(opt == 2){
				deposit();
			}
			else if(opt == 3){
				withdraw();
			}
			else if(opt == 4){
				display();
			}
			else option = 0;
		}
	}


}
