
import java.util.Scanner;
public class NToOne{
    public static int sequence(int n) {
        if(n==0)
        {
            return 1;
        }
        else
        {
            System.out.println(n);
            return sequence(n-1);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sequence(n);
    }

}