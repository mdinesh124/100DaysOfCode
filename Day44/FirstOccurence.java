import java.util.Scanner;
public class FirstOccurence {

    public static int firstOccur(int a[],int low, int high,int x)
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
                return firstOccur(a,mid+1,high,x);
            }
            else if(a[mid]>x)
            {
                return firstOccur(a,low,mid-1,x);
            }
            else{
                if(mid==0 || (a[mid-1]!=a[mid]))
                {
                    return mid;
                }
                else
                {
                    return firstOccur(a,low,mid-1,x);
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
        System.out.println(firstOccur(a,low,high,x));
    }
}
