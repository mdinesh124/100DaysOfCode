import java.util.*;
class MissingNumber
{
static void Missing(int arr[], int l)
{
	boolean []mark = new boolean[l+1];
	for (int i = 0; i < l-2; i++)
		mark[arr[i]] = true;
	for (int i = 1; i <= l; i++)
	if (! mark[i])
		System.out.print(i + " ");

	System.out.println();
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int arr[] =new int[n];
    for(int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
	int l = 2 + n;

	Missing(arr, l);
}
}
