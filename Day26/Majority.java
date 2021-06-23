import java.util.*;
public class Majority {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a[] = new int[n];
         for(int i = 0; i < n; i++)
         {
             a[i] = sc.nextInt();
         }
         int x = sc.nextInt();
         int y = sc.nextInt();
         int countX=0;
         int countY=0;
         for(int i = 0; i < n; i++)
         {
             if(a[i] == x)
             {
                 countX++;
             }
         }
         for(int i = 0; i < n; i++)
         {
             if(a[i] == y)
             {
                 countY++;
             }
         }
         if(countX > countY)
         {
             System.out.println(x);
         }
         else if(countX < countY)
         {
             System.out.println(y);
         }
         else
         {
             System.out.println(Math.min(x,y));
         }
   } 
}
