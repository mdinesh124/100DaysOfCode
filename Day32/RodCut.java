import java.util.Scanner;
class RodCut
{

	static int Rod(int price[], int n)
	{
		if (n <= 0)
			return 0;
		int max_val = Integer.MIN_VALUE;

		for (int i = 0; i<n; i++)
			max_val = Math.max(max_val,
							price[i] + Rod(price, n-i-1));

		return max_val;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

		int size = arr.length;
		System.out.println("Maximum Obtainable Value is "+
							Rod(arr, size));

	}
}
