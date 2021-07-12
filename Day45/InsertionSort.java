
import java.util.*;
public class InsertionSort {
    public static void insertion(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int key= a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            for( j=0;j<n;j++)
            {
                System.out.println(a[j]+"");
            }
            
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
        insertion(a,n);
    }
}
