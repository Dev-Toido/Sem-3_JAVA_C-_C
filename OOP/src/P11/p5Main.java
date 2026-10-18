package P11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class p5Main {
	static void clearTime(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
		String input = sc.nextLine().trim();

		if (input.isEmpty()) {
			System.out.println("Invalid input: Date of birth cannot be empty.");
			sc.close();
			return;
		}

		if (!input.matches("\\d{2}-\\d{2}-\\d{4}")) {
			System.out.println("Invalid date format. Use dd-MM-yyyy.");
			sc.close();
			return;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);

		Date birthDate;

		try {
			birthDate = sdf.parse(input);
		} catch (ParseException e) {
			System.out.println("Invalid date. Please enter a valid calendar date.");
			sc.close();
			return;
		}

		Calendar dob = Calendar.getInstance();
		dob.setTime(birthDate);
		clearTime(dob);

		Calendar today = Calendar.getInstance();
		clearTime(today);

		if (dob.after(today)) {
			System.out.println("Invalid date: Date of birth cannot be in the future.");
			sc.close();
			return;
		}

		int years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		int months = today.get(Calendar.MONTH) - dob.get(Calendar.MONTH);
		int days = today.get(Calendar.DAY_OF_MONTH) - dob.get(Calendar.DAY_OF_MONTH);

		if (days < 0) {
			months--;

			Calendar previousMonth = (Calendar) today.clone();
			previousMonth.add(Calendar.MONTH, -1);

			days += previousMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
		}

		if (months < 0) {
			years--;
			months += 12;
		}

		int totalMonths =
				(today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)) * 12
						+ today.get(Calendar.MONTH) - dob.get(Calendar.MONTH);

		if (today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
			totalMonths--;
		}

		long totalDays =
				(today.getTimeInMillis() - dob.getTimeInMillis())
						/ (24L * 60 * 60 * 1000);

		System.out.println("Age: " + years + " years, "
				+ months + " months, " + days + " days");

		System.out.println("Total Years: " + years);
		System.out.println("Total Months: " + totalMonths);
		System.out.println("Total Days: " + totalDays);

		sc.close();
	}
}