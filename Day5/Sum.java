/**
 * You are given a array that contains integers. You need to return the sum of all array elements.

Example 1:

Input:
numbers = [54, 43, 2, 1, 5]
Output: 
105
Explanation: Just sum it 54+43+2+1+5=105.
Example 2:

Input:
numbers = [324, 5, 2, 2]
Output:
333
Explanation: Just sum it 324+5+2+2=333.
Your Task: 
Write the code to return the sum of all array elements. The array is provided as a parameter to the function arraySum.
Don't print the output, just return it as it will be printed by the driver code.
 */
import java.io.*;
public class Sum {
    public static int arraySum(int a[],int n) {
        int sum=0;
        
        for(int i =0;i<a.length;i++)
        {
            
            
                sum = sum+a[i];
                

        }
        return(sum);
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int a[]=new int[30];
        for(int i = 0; i < n; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(arraySum(a,n));
        
    }
}
