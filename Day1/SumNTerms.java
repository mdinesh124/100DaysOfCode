/*
Given an integer N find the sum of the first N natural number.

Example 1:

Input:
N = 10
Output: 
55
Explanation:
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
Example 2:

Input:

N= 5
Output: 
15
Explanation: 1 + 2 + 3 + 4 + 5 = 15.
Your Task:
The input n is provided as a parameter to the function nSum(). Complete the given code so that it returns the sum of n natural numbers. The driver code prints the answer.


*/

import java.util.Scanner;
import java.io.*;


public class SumNTerms{

    public static int nSum(int n) {
        int ans = n*(n+1)/2;
        return ans;
        
        }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nSum(n));
    }
}
