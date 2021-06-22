import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int res = 1;
        for(int i = 1;i<n;i++)
        {
            if(a[i]!=a[res-1])
            {
                 a[res] = a[i];
                 res++;
            }
        }
        for(int i = 0; i<res; i++)
        {
            System.out.println(a[i]);
        }
    }
}
