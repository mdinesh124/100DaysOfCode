/**
 * Given a Binary Number B, find its decimal equivalent.
 

Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44
 

Your Task:
You don't need to read or print anything. 
Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.
 */
import java.util.Scanner;

class BinToDec
{
    public static int binary_to_decimal(String s)
    {
        int m = 0;
        int k = 1;
        for(int i = s.length() - 1; i >= 0; i--){
        m += (s.charAt(i) - '0') * k;
        k = k * 2;
    }
        return m;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(binary_to_decimal(s));
    }
}
