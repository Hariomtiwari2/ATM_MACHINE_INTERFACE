package AtmMAchineProject;

public class ATM {
	private double balance;
	private double withdrawAmount;
	private double depositAmount;

	// constructor
	public ATM(){

	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
}
