import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class BigInt2 {

    public static BigInteger fib(int n){
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c=BigInteger.valueOf(1);
        for(int j=2;j<=n;j++){
            c=a.add(b);
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
    
            int n = sc.nextInt();

            System.out.println(fib(n));
        }
    }
}