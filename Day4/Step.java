/**
 * Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.

Example 1:

Input:
3

Output:
Three
Example 2:

Input:
11

Output:
Eleven
 */


import java.util.Scanner;
public class Step {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 && n%3==0 && n%11==0){
            System.out.println("Eleven");
        }
        else if(n%2==0 && n%11==0){
            System.out.println("Eleven");
        }
        else if(n%2==0 && n%3==0 )
        {
            System.out.println("Three");
        }
        else if(n%2==0)
        {
            System.out.println("Two");
        }
        else if(n%3==0)
        {
            System.out.println("Three");
        }
        else if(n%11==0)
        {
            System.out.println("Eleven");
        }
        else {
            System.out.println("-1");
        }
    }
}
