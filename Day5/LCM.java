/**
 * Given two numbers a and b. The task is to find out their LCM.

 

Example 1:

Input:
a = 5, b = 10
Output:
10
Explanation:
LCM of 5 and 10 is 10
Example 2:

Input:
a = 14, b = 8
Output:
56
Explanation:
LCM of 14 and 8 is 56
Your Task:
You don't need to read input or print anything.
Your task is to complete the function LCM() which takes two integers a and b as input and return their LCM.
 */
import java.util.Scanner;
public class LCM {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(lcm(a,b));
}
    
}
