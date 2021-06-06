import java.util.Scanner;
public class MiniMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long a[] = new long[5];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        long  max=0;
       
        long sum1,sum2;
        long  min=0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
            

        }
        for(int i=0;i<a.length;i++)
        {
            sum1 = sum-a[i];
           
            if(sum1>max)
            {
                max = sum1;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            sum2 = sum-a[i];
            min = sum2;
            if(sum2<=min)
            {
               min = sum2;
            }
        }
        System.out.println(min+" "+max);
    }
}
