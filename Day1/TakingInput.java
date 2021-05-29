/* 
Before implementing any algorithm, we should be thorough with taking inputs. Here, we will learn how to read inputs.
You are given four inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively. You need to take the input and print a, b, c, d and s in new line.
Read : Java I/O

Example 1:

Input:
5
2.5
6546854
120
geek for geeks

Output:
5
2.5
6546854
120
geek for geeks


*/
import java.io.*;
import java.util.*;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        String s = sc.nextLine();
        byte d = sc.nextByte();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(d);
        


    }
        
    }

