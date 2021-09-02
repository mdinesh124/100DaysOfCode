import java.util.*;
public class nCr {
    public static int fact(int n)
    {
        if(n>=1)
        {
            return n*fact(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int d = n-r;
            int result = (fact(n)/(fact(r)*fact(d)));
            System.out.println(result);
        }
    }
    
}
