import java.util.Scanner;
public class Grading {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i = 0; i < n; i++)
       {
           a[i] = sc.nextInt();
       }
       int grade=0,round;
       for(int i = 0; i < n; i++)
       {
           
           if(a[i]<38)
           {
               System.out.println(a[i]);
           }
            else{
           if(a[i]%5==0)
           {
               System.out.println(a[i]);
           }
           else
           {
               round= (a[i]+4)/5*5;
               if(round-a[i]<3)
               {
                   System.out.println(round);
               }
               else
               {
                   System.out.println(a[i]);
               }
           }
           
        }
        
       }
       
   } 
}
