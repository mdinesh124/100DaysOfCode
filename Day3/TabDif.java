/**
 * Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2.

Example 1:

Input:
n1 = 9, n2 = 4
Output:
5 10 15 20 25 30 35 40 45 50 
Explanation:
9 - 4 = 5, 18 - 8 = 10 , 27 - 12 = 15,
36 - 16 = 20, 45 - 20 = 25, 54 - 24 = 30,
63 - 28 = 35, 72 - 32 = 40, 81 - 36 = 45,
90 - 40 = 50.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;
public class TabDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int n;
        n= Math.abs(n1-n2);
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        
    }
}
