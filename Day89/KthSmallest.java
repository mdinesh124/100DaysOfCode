import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class KthSmallest {
	public static int kthSmallest(Integer[] arr,
								int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
		Integer arr[] = new Integer[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		System.out.print(k+"'th smallest element is " + kthSmallest(arr, k));
	}
}
