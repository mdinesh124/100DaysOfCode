import java.io.*;
import java.util.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(f(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
    
    private static long f(int n, int a, int b){
        return n/a + g(n/a, b);
    }
    
    private static long g(int a, int b){
        if(a < b) return 0;
        else return a/b + g(a-a/b*b + a/b, b);
    }
}