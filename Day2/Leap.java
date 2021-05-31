/*
Given an integer y. Check whether it can represent a leap year or not.

Example 1:

Input:
y = 2020
Output:
True
Explanation:
2020 is leap year as it multilpe of 4 but
not of 100
Example 2:

Input:
y = 2022
Output: 
False
Explanation:
2022 is not a leap year, as its neither
multiple of 400 nor of 4



*/


import java.io.*;
public class Leap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    if(n%4 == 0 && n%100 != 0)
    {
        System.out.println("True");
    }
    else if(n%400==0)
    {
        System.out.println("True");

    }
    else{
        System.out.println("False");
    }
    }
    
}
