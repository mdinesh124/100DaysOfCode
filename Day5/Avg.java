/**
 * You are given an array numbers that contains integers. You need to return average of the non negative integers.

Example 1:

Input:
numbers = [-12, 8, -7, 6, 12, -9, 14]
Output:
avg = 10
Explanation: The positive numbers are
8 6 12 14.
The sum is 8+6+12+14 = 40,
Average = 40/4 = 10

Example 2:

Input:
numbers = [1, 2, 3]
Output:
avg = 2
Explanation: The positive numbers are
1 2 3.
The sum is 1+2+3 = 6, Average = 6/3 = 2
Your Task:
Write the code at the mentioned place and return the average of the positive numbers. 
The function posAverage takes numbers array & its size as arguments and expects average of non negative numbers as a return value.
 */
import java.io.*;
public class Avg {
    public static int posAverage(int a[],int n) {
        int sum=0;
        int count=0;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                sum = sum+a[i];
                count++;
            }

        }
        return(sum/count);
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int a[]=new int[30];
        for(int i = 0; i < n; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(posAverage(a,n));
        
    }
}
