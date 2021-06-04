/*
Given length L and breadth B of N rectangles. The task is to return maximum area of the rectangle.

Example 1:

Input:
3
1 2 3 4 5 6

Output:
30

Explanation:
Area of rectangle with length 5 and 
breadth 6 is maximum, and is equal to 30.
Example 2:

Input:
2
12 3 40 5 

Output:
200

Explanation:
Area of rectangle with length 40 and 
breadth 5 is maximum, and is equal to 200.

*/
import java.util.Scanner;
public class MaxRect{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n*2];
        for(int i = 0; i <n*2; i++)
        {
            a[i] = sc.nextInt();
        }
        
        
        int area = 0,max=0;
        for(int i = 0; i < n*2; i+=2)
        {
           area  = a[i]*a[i+1];
           if(area>max)
           {
            max = area;
           }
           
        }System.out.println(max);

    }
}