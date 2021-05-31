/**
 * 
 * 
 * 
 * 
 * Given a number N find the prime factorization of the number.

Example 1:

Input:
N = 100
Output:
2 2 5 5
Explanation:
100 = 2 * 2 * 5 * 5
 

Example 2:

Input:
N = 27
Output:
3 3 3
Explanation:
27 = 3 * 3 * 3

 */
import java.io.*;
public class Factorization {
    public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if(n>0){
    while(n%2==0){
        System.out.print("2"+" ");
        n = n/2;
    }
    for(int i =3; i<=Math.sqrt(n);i+=2){
        while(n%i==0){
            System.out.print(i+" ");
            n=n/i;
        }
    
}
}
else{
    System.out.println("Invalid");
}

    }
}
