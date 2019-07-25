package pojo;

public class AccountInfo {

	private int balance;

	public AccountInfo() {
		balance = 1000; // Set balance to $1000 by default
	}

	public void depositAmount(int amount) {
		balance += amount;
	}

	/*
	 * Returns true if able to withdraw and deducts amount from balance returns
	 * false if unable to withdraw due to insufficient value
	 */
	public boolean withdrawAmount(int amount) {
		if (isWithdrawOk(amount)) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public int getBalance() {
		return balance;
	}

	public boolean isWithdrawOk(int amount) {
		if (balance < amount) {
			return false;
		} else {
			return true;
		}
	}
	
}
