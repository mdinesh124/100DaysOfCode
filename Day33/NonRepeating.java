import java.util.Scanner;
class NonRepeating {

	static int firstNonRepeating(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < n; j++)
				if (i != j && arr[i] == arr[j])
					break;
			if (j == n)
				return arr[i];
		}

		return -1;
	}
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }

		System.out.print(firstNonRepeating(arr, n));
	}
}
