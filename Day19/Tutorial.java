import java.util.Scanner;
public class Tutorial 
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i = 0; i < n; i++)
       {
           a[i] = sc.nextInt();
       } 
       for(int i = 0; i < n; i++)
       {
           if(a[i] == num)
           {
               System.out.println(i);
           }
       }
    }
}