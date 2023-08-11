package de.telran.khakov.rustam.homeworks.homework3;

/**
 * @author Rustam Khakov
 */
public enum DayOfWeek {
	MONDAY("Monday", "Понедельник"),
	TUESDAY("Tuesday" ,"Вторник"),
	WEDNESDAY("Wednesday", "Среда"),
	THURSDAY("Thursday", "Четверг"),
	FRIDAY("Friday", "Пятница"),
	SATURDAY("Saturday", "Суббота"),
	SUNDAY("Sunday", "Воскресение");

	private String name;
	private String russianName;

	DayOfWeek(String name, String russianName) {
		this.russianName = russianName;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getRussianName() {
		return russianName;
	}
}
