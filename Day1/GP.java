/*
Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Example 1:

Input:
A = 2 
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
Example 2:

Input:
A = 1
B = 2
N = 2
Output: 2
Explanation: Common ratio = 2,
Hence second term is 2.


*/


import java.util.Scanner;
import java.io.*;
public class GP{

    public static int terms(int n, int a, int r)
    {
       int ans = a*((int)Math.pow(r,n-1));
       return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int r  = sc.nextInt();
        int n  = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("r = "+r);
        System.out.println("n = "+n);
        System.out.println(terms(n,a,r));




    }



}