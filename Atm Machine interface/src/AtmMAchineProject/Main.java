package AtmMAchineProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		AMTOPERATION_imp atmImplimentation = new AMTOPERATION_imp();
		int atmPin = 123;
		int atmNumber = 123;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Atm Number: ");
		int ATMNumber = sc.nextInt();
		System.out.print("Enter your Atm Pin: ");
		int ATmPin = sc.nextInt();
		if ((ATMNumber == atmNumber) && (ATmPin == atmPin)){
			System.out.println("Select among the following options ");
			while (true){
				System.out.println("1.View available balance\t2.Withdraw\t3.Deposite\t4.view mini statement\t5.Exit ");
				System.out.print("Enter the choice: ");
				int ch = sc.nextInt();
				if (ch == 1){
					atmImplimentation.viewBalance();

				}
				else if (ch == 2) {
					System.out.println("Amount to be withdrawn: ");
					System.out.print("\u20B9");
					double amtTowithdraw =  sc.nextDouble();
					atmImplimentation.withdraw(amtTowithdraw);
				}
				else if (ch == 3) {
					System.out.print("Enter amount to deposit: ");
					double amtTodeposit = sc.nextDouble();
					atmImplimentation.deposite(amtTodeposit);
//					System.exit(0);

				}
				else if (ch == 4) {
					atmImplimentation.viewStatement();
				}
				else if(ch == 5){
					System.out.println("collect your Atm card");
					System.out.println("    Thank you :) ");
					System.exit(0);

				}
				else {
					System.out.println("please enter the correct choice");
				}
			}
		}else {
			System.out.println("Wrong Atm number or password");
			System.exit(0);
		}
	}
}
