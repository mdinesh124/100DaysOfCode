/**
 * Given an array arr[] of size n, find count of all the distinct elements in an array

Example 1:

Input: 
n = 4
arr = {2, 2, 3, 2}
Output: 
2
Example 2:

Input: 
n = 5
arr = {12, 1, 14, 3, 16}
Output: 
5
Your Task:
You do not need to read input or print anything. 
Your task is to complete the function distinct() which takes the array arr and n as input parameters and returns the number of distinct elements in the array.

Constraints:
1 ≤ n ≤ 100
1 ≤ arr[i] ≤ 1000
 */

import java.util.Scanner;

class Distinct {

    public static int distinct(int[] arr,int n){
        int count=0;
        boolean isDistinct=true;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true){
                count++;
            }
            isDistinct=true;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print(distinct(arr,n));
    }
}
