/* 
Working with Data Types is very important in programming world. Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: a (int), b (float), c (double), l (long), d (byte). Your task is to do step-wise operations as given below:
1. Divide c by b.
2. Divide b by a.
3. Divide c by a.
4. Add result at step 3 with l.
5. Divide a by d.

Example 1:

Input:
1 2 3 5 127

Output:
1.5 2.0 3.0 8.0 0

Exaplanation:
a=1, b=2, c=3, l=5, d=127
c/b=1.5
b/a=2.0
c/a=3.0
(c/a)+l=8.0
a/d=0
Example 2:

Input:
2 4 8 16 32

Output:
2.0 2.0 4.0 20.0 0

Explanation:
a=2, b=4, c=8, l=16, d=32
c/b=2.0
b/a=2.0
c/a=4.0
(c/a)+l=2.0
a/d=0
User Task:
Your task is to complete the provided function dataTypes() following the above given steps.

Constraints:
1 <= a, b, c <= 106
1 <= d <= 127
1 <= l <= 1018
*/
import java.util.Scanner;
import java.io.*;
public class DataTypes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        long l = sc.nextLong();
        byte d = sc.nextByte();
        System.out.print(c/b+"\t");
        System.out.print(b/a+"\t");
        System.out.print(c/a+"\t");
        System.out.print((c/a)+1+"\t");
        System.out.print(a/d+"\t");
        
       
   } 
}
