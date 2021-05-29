/*
Given two positive integers a and b. Your task is to perform right shift bitwise operation on it as given below:
Do a>>b.
 

Example 1:

Input:
a = 5
b = 2
Output: 
1 
Explanation: 5>>2 = 1.
Example 2:

Input:
a = 4 
b = 1
Output: 
2
Explanation: 4>>1 = 2.

*/


import java.util.Scanner;
import java.io.*;
public class RightShift {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.format("c=%d",a>>b);
}

}

