/*
Given a natural number N. You have to find the number of digits in it.
 

Example 1:

Input:
n = 5534
Output:
4
Explanation: 5534 has 4 digits
Example 2:

Input:
n = 100273
Output:
6
Explanation: 100273 has 6 digits



*/
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(a>0)
        {
            a = a/10;
            count++; 
        }
        System.out.println(count);
    }
}
