import java.util.Scanner;
public class Records {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int min=a[0],max=a[0],maxcount=0,mincount=0;
        for(int i = 1; i < n; i++)
        {
        
            if(a[i]>max)
            {
                max = a[i];
                maxcount++;

            }
            if(a[i]<min)
            {
                min = a[i];
                mincount++;
            }
        }
        System.out.println(maxcount+" "+mincount);
    }
}
