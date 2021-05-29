/*
Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.

Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~e
Note: ^ is for xor.

Example 1:

Input:
4 8 2

Output:
0
10
0
2
-11
Example 2:

Input:
7 7 7

Output:
0
0
7
7
-1


*/ 


import java.util.Scanner;
import java.io.*;
public class Bitwise{


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("d = "+b);
        System.out.println("n = "+c);
         System.out.println(c ^ b);
        
         System.out.println(a & b);
       
         System.out.println(c | (a ^ a));
        
         System.out.println(a ^ a);
        




    }



}