import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int curr = 0;
        int e = 100;
        curr = (curr+k)%n;
        e -= 1+c[curr]*2;
        while (curr != 0) {
            curr = (curr+k)%n;
            e -= 1+c[curr]*2;
        }
        System.out.println(e);
    }
}