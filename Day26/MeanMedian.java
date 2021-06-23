import java.util.*;
public class MeanMedian{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int median;
        for(int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        int mean = sum/n;
        Arrays.sort(a);
        if(n%2==0)
        {
           median = (a[(n-1)/2]+a[n/2])/2;
        }
        else
        {
            median = (a[n/2]);
        }
        System.out.println(mean+" "+median);
    }
}