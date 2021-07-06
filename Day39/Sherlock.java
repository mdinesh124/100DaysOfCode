/*import java.util.*;
public class Sherlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int j=0;j<n;j++){
           int count=0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
        {
           int square= (int)Math.sqrt(i);
            if((square*square==i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
        
    }
}*/
import java.util.Scanner;
class Sherlock
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    int a=sc.nextInt();
    int b=sc.nextInt();
    int count=0;
    int sq=(int) Math.sqrt(a);
    int s=sq*sq;
        if(s<a)
            {
            sq++;
            s=sq*sq;
        }
     while(s>=a && s<=b)
    {
        count++;
         sq++;
         s=sq*sq;
    
    }
    
    System.out.println(count);
    }
}
}

