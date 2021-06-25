
import java.io.*;
import java.util.Scanner;

class SumDigits
{
	
	static int sum_of_digit(int n)
	{
		if (n == 0)
			return 0;
		return (n % 10 + sum_of_digit(n / 10));
	}

	
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = sum_of_digit(num);
		System.out.println("Sum of digits in " +
						num + " is " + result);
	}
}


