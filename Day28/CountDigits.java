
import java.util.*;

class CountDigits {

	static int countDigit(long n)
	{
		if (n/10 == 0)
			return 1;
		return 1 + countDigit(n / 10);
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
		System.out.print("Number of digits : "
						+ countDigit(n));
	}
}


