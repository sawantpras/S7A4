import java.util.Scanner;

// InvalidDateException created to handle the invalid date input
class InvalidDateException extends Exception {

	// parameterized constructor for handling invalid input exception
	public InvalidDateException(String msg) {
		super(msg);
	}
}

// DateDetails class created to display the date in particular format
public class DateDetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String month;
		int day;
		int year;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day :");
		day = sc.nextInt();

		System.out.println("Enter the year :");
		year = sc.nextInt();

		System.out.println("Enter the month :");
		month = sc.next();

		// To check the day and year is valid or not.
		if ((day > 0 && day <= 31) && (year > 0)) {
			System.out.println(+year + "-" + month + "-" + day);
		} else {
			throw new InvalidDateException("Invalid date input");
			// System.out.println("Input valid date.....");
		}

	}

}