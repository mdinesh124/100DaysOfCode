import java.util.Scanner;
import java.util.*;

class PowerSet
{
	static void powerSet(String str, int index,
							String curr)
	{
		int n = str.length();

	
		if (index == n)
		{
			return;
		}

		
		System.out.println(curr);
		for (int i = index + 1; i < n; i++)
		{
			curr += str.charAt(i);
			powerSet(str, i, curr);
			curr = curr.substring(0, curr.length() - 1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		int index = -1;
		String curr = "";
		powerSet(str, index, curr);
	}
}
