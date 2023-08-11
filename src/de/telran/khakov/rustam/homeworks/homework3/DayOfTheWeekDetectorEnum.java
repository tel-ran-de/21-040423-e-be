package de.telran.khakov.rustam.homeworks.homework3;

/**
 * @author Rustam Khakov
 */
public class DayOfTheWeekDetectorEnum implements DayOfTheWeekDetector {
	@Override
	public String detectDayName(int number) {
		DayOfWeek[] values1 = DayOfWeek.values();
//		for (int i = values1.length - 1; i >= 0; i--) { // 7
//			if (number -1 == i) {
//				return values1[i].getName();
//			}
//		}
//		return "Please input a valid number between 1 and 7";

		DayOfWeek[] values = values1;
		if (number > values.length || number < 1) { // 2
			return "Please input a valid number between 1 and 7";
		}
		return values[number - 1].name(); // 1
		//3
	}
}
