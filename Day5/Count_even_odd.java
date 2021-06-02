/**
 * Given an array A of N elements. The task is to count number of even and odd elements in the array.

Example 1:

Input:
5
1 2 3 4 5

Output:
3 2

Explanation:
In the given array, there are 3 odd elements 
(1, 3, 5) and 2 even elements (2 and 4).
Example 2:

Input:
4
1 6 18 7

Output:
2 2

Explanation:
In the given array, there are 2 odd
elements (1, 7) and 2 even elements (6 and 18).
User Task:
Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space. You need to provide the new line.

Constraints:
1 <= N <= 106
1 <= Ai <= 106
 */
import java.io.*;
public class Count_even_odd {
    public static  int countOddEven(int a[],int n) {
        
        int even=0;
        int odd=0;
        for(int i =0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
                
        
                
            }
            else{
                odd++;
               
            }

        }
        return(even);
        
       
        
        
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int a[]=new int[30];
        for(int i = 0; i < n; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(countOddEven(a,n));
        
    }
}
