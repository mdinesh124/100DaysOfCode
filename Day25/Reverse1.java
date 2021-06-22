import java.util.*;
public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int low=0,high=n-1;
        while(low<high)
        {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        for(int i = 0; i < n; i++){
        System.out.println(a[i]);
        }


    }
}
