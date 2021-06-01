/**
 * Given an integer N. Write a program to return the factorial of N.
Note: 0 factorial is equal to 1.

Example 1:

Input:
N = 10
Output: 
3628800
Explanation:
1*2*3*4*5*6*7*8*9*10 = 3628800 .
Your Task:
The input N is provided as a parameter to the function nFactorial. 
Complete the given code so that it returns the factorial of N. The output is printed by the driver code.
 */
import java.io.*;
public class Fact {

    public static int nFactorial(int n){
        int f = 1;
        if(n==0)
        {
            System.out.println("1");
        }
        if(n>0)
        {
            for(int i=n;i>0;i--){
                f=f*i;
            }
        }return f;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(nFactorial(n));

    }
}
