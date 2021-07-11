import java.util.*;
public class BinarySearch {
    public static int binarySearch(int a[],int low, int high,int x)
    {
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]<x)
            {
                return binarySearch(a,mid+1,high,x);
            }
            else if(a[mid]>x)
            {
                return binarySearch(a,low,mid-1,x);
            }
            else{
                return mid;
            }

        }
        return -1;
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
        System.out.println(binarySearch(a,low,high,x));

    }
}
