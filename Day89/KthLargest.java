import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class KthLargest {
	public static int kthLargest(Integer[] arr,
								int k)
	{
		Arrays.sort(arr);
		return arr[arr.length-k];
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
		System.out.print(k+"'th largest element is " + kthLargest(arr, k));
	}
}
