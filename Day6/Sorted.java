/**
 * Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
Example 2:

Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.

Your Task:
You don't need to read input or print anything. 
Your task is to complete the function arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean value (true if it is sorted otherwise false).
 */
import java.util.Scanner;

class Sorted {

    public static boolean arraySortedOrNot(int[] a,int n){
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean ans=arraySortedOrNot(a,n);
        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
