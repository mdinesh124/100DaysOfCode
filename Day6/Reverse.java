/**
 * Given a string s, you need to reverse it.

Example 1:

Input:
s = "Hello"
Output: 
olleH
Explanation: Reverse of Hello is olleH
Example 2:

Input:
s = "World"
Output:
dlroW
Explanation: Reverse of World is dlroW
Your Task: 
The task is to complete the reverseString() which takes a string s as parameter and returns the reversed string.
 */

import java.util.Scanner;
public class Reverse {

    public static String reverseString(String str) {
        String str1 = "";
        int ptr = str.length() - 1;
        while(ptr>=0)
        {
            str1 = str1+str.charAt(ptr);
            ptr--;
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
    
}
