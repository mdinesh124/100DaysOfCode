import java.util.Scanner;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i]!=0)
            {
                int temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}
