import java.util.Scanner;

public class ExceptionNumberFormat {

	public static void main(String[] args) {
		String val;
		int num;
		System.out.println("Problem Detail: To parse a string into int.");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		val = sc.next();
		try {
			num = Integer.parseInt(val);
			System.out.println("Value of num: " + num);
		} catch (NumberFormatException ne) {
			System.out.println("Number format exception: " + ne);
		} catch (Exception e) {
			System.out.println("Some exception in the code: " + e);
		}
	}

}
