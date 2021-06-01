/**
 * Given an integer n check if n is prime or not.
A prime number is a number that is divisible by 1 and itself only.

Example 1:

Input:
n = 17
Output: 
True
Explanation:
17 is  divisible by  only 1 and 17.
So it's a prime number.
Example 2:

Input:
n = 56
Output: 
False
Explanation:
56 is divisible by 2, 4, 7.....etc. So
its not a prime number.
Your Task:
The input n is provided as a parameter to the function prime. 
Complete the given code so that it returns a boolean value. Don't print anything.
 */
public class Prime{    
  public static void main(String args[]){    
   int i,m=0,f=0;      
   int n=3;
   if(n==0||n==1){  
    System.out.println("False");      
   }else{  
    for(i=2;i<=m;i++){      
     if(n%i==0){      
      System.out.println("False");      
      f=1;      
      break;      
     }      
    }      
    if(f==0)  { System.out.println("True"); }  
   }
 }    
 }   