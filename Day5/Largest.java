/**
 * Given an array A[] of size n. The task is to find the largest element in it.
 

Example 1:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
 

Example 2:

Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output:
5
Explanation:
The largest element of given array is 5.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function largest() which takes the array A[] and its size n as inputs and returns the maximum element in the array.
*/
 import java.io.*;
public class Largest {
    public static int largest(int a[],int n) {
       
        int max = a[0];
        for(int i =1;i<n;i++)
        {
            
            
                if(a[i]>max){
                    max = a[i];
                }
                

        }
        return(max);
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int a[]=new int[30];
        for(int i = 0; i < n; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(largest(a,n));
        
    }
}
