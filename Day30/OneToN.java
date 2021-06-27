import java.util.Scanner;
public class OneToN{
    public static int sequence(int n, int k) {
        if(n==0)
        {
            return 1;
        }
        else
        {
            System.out.println(k);
             return sequence(n-1,k+1);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        sequence(n,k);
    }

}
