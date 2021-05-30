/*
Given an integer n check if n is prime or not.
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



*/
import java.util.Scanner;
public class Pr{    
    public static void main(String args[]){    
     int i,m=0,flag=0;      
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     m=n/2;      
     if(n==0||n==1){  
      System.out.println("not prime number");      
     }else{  
      for(i=2;i<=m;i++){      
       if(n%i==0){      
        System.out.println("not prime number");      
        flag=1;      
        break;      
       }      
      }      
      if(flag==0)  { System.out.println("prime number"); }  
     }
   }    
   }   
