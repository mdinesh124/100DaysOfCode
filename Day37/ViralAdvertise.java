import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertise{
    
    
    
    public static int viral(int day) {
        int numReceived = 0;
        int num = 5;
        while (day >= 1) {
            int newNum = num / 2;
            numReceived += newNum;
            num = newNum * 3;
            day--;
        }
        return numReceived;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        System.out.println(viral(days));
    }
}
