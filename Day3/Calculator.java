/**
 * Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 

If operator equals to 1 add a and b, then print the result.

If operator equals to 2 subtract b from a, then print the result.

If operator equals to 3 multiply a and b, then print the result.

If operator equals to any another number, print "Invalid Input"(without quotes).


Example 1:

Input:
a = 1
b = 2
operator = 3
Output: 
2
Explanation: 1 * 2 = 2
Example 2:

Input:
a = 2
b = 2
operator = 2
Output:
0
Explanation: 2 - 2 = 0
 */

import java.util.Scanner;
public class Calculator {
    public static int utility(int a,int b,int op)
    {
        switch (op) {
            case 1:
            return (a+b);
            
            case 2:
            return (a-b);
        
            case 3:
            return (a*b);

            default:
            return (0);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.nextInt();
       System.out.println(utility(a,b,op));
        
    }
}
