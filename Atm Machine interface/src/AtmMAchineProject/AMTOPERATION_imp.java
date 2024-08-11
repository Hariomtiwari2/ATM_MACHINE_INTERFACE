package AtmMAchineProject;

import java.util.HashMap;
import java.util.Map;

public class AMTOPERATION_imp  implements AMTPERATIONS{
	ATM atm = new ATM();
	HashMap<Double , String > ministmnt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available balance: \u20B9"+atm.getBalance());

	}

	@Override
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount%500 == 0 || withdrawAmount%100 == 0 ) {
			if (withdrawAmount <= atm.getBalance()) {
				ministmnt.put(withdrawAmount, " Withdrawn");
				System.out.println("\u20B9"+withdrawAmount + " Amount withdrawn successfully: ");
				System.out.println("collect your cash ");
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Not enough funds");
			}
		}
		else {
			System.out.println("Please enter amount in dominations of 500 OR 100");
		}

	}

	@Override
	public void deposite(double depositeAmount) {
		ministmnt.put(depositeAmount , " Deposited");
		System.out.println("\u20B9"+depositeAmount+" Amount deposited successfully");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
	}

	@Override
	public void viewStatement() {
			for (Map.Entry<Double , String> m:ministmnt.entrySet()){
				System.out.println("\u20B9"+m.getKey()+""+""+m.getValue());
			}

	}
}
