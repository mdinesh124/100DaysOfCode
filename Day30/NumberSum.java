import java.util.*;
public class NumberSum {
    public static int getSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+getSum(n-1);
    
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }
}
