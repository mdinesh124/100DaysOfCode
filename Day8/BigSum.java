/**
 * In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

int ar[n]: an array of integers .
Return

long: the sum of all array elements
Input Format

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

Output Format

Return the integer sum of the elements in the array.
 */
import java.util.Scanner;
public class BigSum {
    public static long arraySum(long a[]) {
        long sum=0;
        
        for(int i =0;i<a.length;i++)
        {
            
            
                sum = sum+a[i];
                

        }
        return(sum);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long a[]=new long[n];
        for(int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(arraySum(a));
        
    }
}
