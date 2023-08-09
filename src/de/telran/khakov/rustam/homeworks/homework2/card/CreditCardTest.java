package de.telran.khakov.rustam.homeworks.homework2.card;

/**
 * @author Rustam Khakov
 */
public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard card = new CreditCard("1234-1234-1234-1234", 7632);
		System.out.println(card.deposit(100, 1234));
		System.out.println(card.deposit(10, 7632));
		System.out.println(card.withdraw(10, 1234));
		System.out.println(card.withdraw(100, 7632));
		card.setCreditLimit(100);
		System.out.println(card.withdraw(100, 7632));
		System.out.println(card);
		System.out.println(card.getCreditDebt());
		System.out.println(card.getBalance());
	}
}
