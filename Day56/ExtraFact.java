import java.util.*;
import java.math.*;

public class ExtraFact {
    
    static BigInteger factorial(int n){
        BigInteger product=BigInteger.ONE;
        for(int i=2; i<=n; i++){
            product= product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}