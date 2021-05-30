/*

Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

Example 1:

Input:
A = 6
B = 9
Output:
3
Explanation:
After 3 there is no number that can
divide both 6 and 9 perfectly.

Example 2:

Input:
A = 10
B = 15
Output: 
5
Explanation:
5 is the greatest common divisor of
10 and 15.



*/

import java.util.Scanner;
public class GCD {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans=0;
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = Math.min(a,b);
    for(int i=1;i<n;i++){
        if(a%i==0 && b%i==0){
             ans = i;
        }
        
    }
    System.out.println(ans);

}
    
}
