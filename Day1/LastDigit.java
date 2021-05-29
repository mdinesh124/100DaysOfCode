/*Given an integer N. Write a program to find last digit of the number.

Example 1:

Input:
N = 10
Output: 
0
Example 2:

Input:
N = 9768
Output: 
8



*/

import java.math.*;
import java.util.Scanner;
import java.io.*;
public class LastDigit {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N = "+N);
        N = Math.abs(N);
        System.out.println(N%10);

    }

}