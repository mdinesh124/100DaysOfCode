/*Given three numbers a, b, and c; you need to find which is the greatest of them all.

Example 1:

Input:
a = 1
b = 2
c = 3
Output: 
3
Explanation: Clearly, c = 3 is the
greatest of (1,2,3)
Example 2:

Input:
a = 2
b = 2
c = 5
Output:
5
Explanation: Out of (2,2,5) 5 is the
greatest.



*/


import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = Math.max(a,b);
        int n = Math.max(ans,c);System.out.println(n);
    }
}
