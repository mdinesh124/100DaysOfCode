import java.io.*;

class ReversePyramidStar{
	
public static void main (String[] args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
	int i, j;
	for(i = n; i >= 1; i--)
	{
		for(j = i; j < n; j++)
		{
			System.out.print(" ");
		}
		for(j = 1; j <= (2 * i - 1); j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
