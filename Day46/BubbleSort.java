import java.util.*;
public class BubbleSort{
    public static void bubble(int a[],int n)
    {
        int temp;
        for(int i = 0; i < n-1; i++)
        {
            int swap = 0;
            
            for(int j = 0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                   swap++;
                }
            }
            if(swap==0)
            {
                break;
            }
        }
        for(int j = 0;j<n;j++)
        {
            System.out.println(a[j]+"");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        bubble(a,n);
    }
}