/**
 * 
 * Given a number N, find the first digit of the number.

Example 1:

Input:
N = 123
Output:
1
 

Example 2:

Input:
N = 976
Output:
9
 */
import java.util.Scanner;
public class First {

 public   static int count(int n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n = sc.nextInt();
         x =n/(int)(Math.pow(10,count(n)-1));
         System.out.println(x);
        
    
    
    
    
    

    }
}
