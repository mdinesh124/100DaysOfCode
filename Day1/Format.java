/* 

There are times when your answer is a floating point that contains undesired amount of digits after decimal. Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point.
Note: You may use System.out.format()

Example 1:

Input:
5.43 2.653

Output:
2.04674 2.047
Example 2:

Input:
3.25 2.5

Output:
1.3 1.300

*/
import java.util.Scanner;
import java.io.*;
public class Format {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(a/b);
        System.out.format("%.3f",a/b);

        
    }
}
