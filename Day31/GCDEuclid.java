import java.util.*;
import java.lang.*;

class GCDEuclid
{
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		
		return gcd(b%a, a);
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		int g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b+ ") = " + g);

	}
}
