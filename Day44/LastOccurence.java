import java.util.Scanner;
public class LastOccurence {

    public static int lastOccur(int a[],int low, int high,int x,int n)
    {
        
        if(low>high)
        {
            return -1;
        }
        else
        {
            int mid = (low+high)/2;
            if(a[mid]<x)
            {
                return lastOccur(a,mid+1,high,x,n);
            }
            else if(a[mid]>x)
            {
                return lastOccur(a,low,mid-1,x,n);
            }
            else{
                if(mid== n-1 || (a[mid+1]!=a[mid]))
                {
                    return mid;
                }
                else
                {
                    return lastOccur(a,mid+1,high,x,n);
                }
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
        int x = sc.nextInt();
        int low=0,high=n-1;
        System.out.println(lastOccur(a,low,high,x,n));
    }
}
