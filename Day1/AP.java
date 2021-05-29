/*
Given three integer, a,d and n. Where a is the first term, d is the common difference of an A.P.  Calculate the nth term of A.P.  The nth term is given by an = a + (n-1)d

Example1:

Input:
a = 5
d = 2
n = 5
Output:
13
Explanation:
anth = a + (n-1)d = 5 + (5-1)*2 = 5 + 8 = 13
 

Example2:

Input:
a = 10 
d = 10 
n = 101 
Output:
1010 
Explanation: anth = a + (n-1)d = 10 + (101-1)*10
= 10 + 1000 = 1010.



*/

import java.util.Scanner;
import java.io.*;
public class AP{

    public static int terms(int n, int a, int d)
    {
       int ans = a+(n-1)*d;
       return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int d  = sc.nextInt();
        int n  = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("d = "+d);
        System.out.println("n = "+n);
        System.out.println(terms(n,a,d));




    }



}