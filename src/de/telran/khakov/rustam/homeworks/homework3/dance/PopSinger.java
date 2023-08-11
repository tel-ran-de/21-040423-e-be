package de.telran.khakov.rustam.homeworks.homework3.dance;

/**
 * @author Rustam Khakov
 */
public class PopSinger implements Jumpable, Singable {
	public PopSinger() {
	}


	@Override
	public void jump() {
		System.out.println("я могу прыгать");
	}

	@Override
	public void jump(int high) {
		System.out.println("я могу прыгать");
	}

	@Override
	public void sing() {
		System.out.println("я пою поп песни");
	}
}
