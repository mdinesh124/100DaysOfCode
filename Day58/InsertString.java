import java.util.*;
import java.lang.*;

class InsertString {
	public static String insertString(
		String originalString,
		String stringToBeInserted,
		int index)
	{
		String newString = new String();

		for (int i = 0; i < originalString.length(); i++) {
			newString += originalString.charAt(i);

			if (i == index) {
				newString += stringToBeInserted;
			}
        }
		return newString;
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String  originalString = sc.nextLine();
		String stringToBeInserted = sc.nextLine();
		int index = sc.nextInt();

		System.out.println("Modified String: "
						+ insertString(originalString,
										stringToBeInserted,
										index));
	}
}
