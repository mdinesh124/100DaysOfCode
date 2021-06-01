/**
 * Here, we will use while loop and print a number n's table in reverse order.

Example 1:

Input:
1

Output:
10 9 8 7 6 5 4 3 2 1
Example 2:

Input:
2

Output:
20 18 16 14 12 10 8 6 4 2
User Task:
Your task is to complete the provided function.

Constraints:
1 <= n<= 1000
 */
import java.io.*;
public class RevTab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int  i =10;
        while(i>0)
        {
           System.out.println(n*i);
           i--;
        }
    }
}
