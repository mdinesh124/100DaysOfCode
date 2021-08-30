import java.util.*;

class RotationSum
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i = 0;i<n;i++)
	    {
	        a[i] = sc.nextInt();
	    }
		int Sum = 0;
		int curr = 0;
		for (int i=0; i<n; i++)
		{
			Sum = Sum + a[i];
			curr = curr+(i*a[i]);
		}
		int max = curr;
		for (int j=1; j<n; j++)
		{
			curr = curr + Sum-n*a[n-j];
			if (curr > max)
				max = curr;
		}
		System.out.println(max);
	}
}
