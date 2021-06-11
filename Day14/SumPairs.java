import java.util.Scanner;
public class SumPairs{
    public static int divisibleSumPairs(int n,int a[], int k)
    {
        int count =0;
    for(int i = 0; i < n; i++)
    {
        for(int j=1;j<n;j++)
        {
        if(i<j)
        {
            if((a[i]+a[j]) %k==0)
            {
                count++;
            }
        }
    }
    }
    return(count);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0;i < n;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println(divisibleSumPairs(n,a,k));
}
 
}
