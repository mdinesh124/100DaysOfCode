import java.util.*;
public class TimeInWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        String a[] = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
         "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", 
         "twenty seven", "twenty eight", "twenty nine"};
        if(m<=30)
        {
         if(m==0)
         {
             System.out.println(a[h]+" o' clock");
         }
         else if(m==15)
         {
             System.out.println("quarter past "+a[h]);
         }
         else if(m==30)
         {
             System.out.println("half past "+a[h]);
         }
         else if(m==1)
         {
             System.out.println(a[m]+" minute past "+a[h]);
         }
         else{
            System.out.println(a[m]+" minutes past "+a[h]);
         }
        }
        else
        {
            if(m==45)
            {

                System.out.println("quarter to "+a[h+1]);
            }
            else if(m==59)
            {
                System.out.println(a[60-m]+"minute to "+a[h+1]);
            }
            else{
                System.out.println(a[60-m]+"minutes to "+a[h+1]);
            }
        }

    }
}
