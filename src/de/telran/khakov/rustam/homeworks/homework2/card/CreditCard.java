package de.telran.khakov.rustam.homeworks.homework2.card;

/**
 * @author Rustam Khakov
 */
public class CreditCard {
	private final String number;
	private int pin;
	private int balance;
	private int creditLimit;
	private int creditDebt;

	public CreditCard(String number, int pin) {
		this.number = number;
		this.pin = pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public int getCreditDebt() {
		return creditDebt;
	}

	public String getNumber() {
		return number;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public boolean deposit(int sum, int pin) {
		System.out.printf("попытка пополнения %d%n",sum);
		if (pin != this.pin || sum < 0) {
			System.out.println("Операция отклонена");
			return false;
		}
		if (creditDebt>0) {
			if (sum > creditDebt) {
				balance += (sum - creditDebt);
				creditDebt = 0;
			} else {
				creditDebt -= sum;
			}
		}
		return true;
	}


	public boolean withdraw(int sum, int pin) {
		System.out.printf("попытка снятия %d%n",sum);
		if (pin != this.pin || sum < 0) {
			System.out.println("Операция отклонена");
			return false;
		}
		if (balance >= sum) {
			balance -= sum;
		} else {
			int diff = sum - balance;
			if (creditLimit < creditDebt + diff) {
				System.out.println("Операция отклонена");
				return false;
			}
			creditDebt += diff;
			balance = 0;
		}
		return true;
	}

	public boolean checkPin(int pin) {
		return this.pin == pin;
	}

	@Override
	public String toString() {
		return "CreditCard{" +
				"number='" + number + '\'' +
				", pin= ****"  +
				", balance=" + balance +
				", creditLimit= ****" +
				", creditDebt= ****" +
				'}';
	}
}
