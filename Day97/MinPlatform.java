import java.util.*;
class MinPlatform {
	static int Platform(int n,int arr[], int dep[])
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int plat = 1, result = 1;
		int i = 1, j = 0;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				plat++;
				i++;
			}
			else if (arr[i] > dep[j]) {
				plat--;
				j++;
			}
			if (plat > result)
				result = plat;
		}

		return result;
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int dep[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            dep[i] = sc.nextInt();
        }
		System.out.println(Platform(n,arr, dep));
	}
}
