import java.util.*;
public class PatternMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();
        char t,p;
        int count = 0;
        for(int i = 0; i < text.length()-pattern.length(); i++) {
            t = text.charAt(i);
            p = pattern.charAt(0);
            if(t==p)
            {
                for(int j=0,k=i;j<pattern.length();j++,k++)
                {
                    t = text.charAt(k);
                    p = pattern.charAt(j);
                    if(t==p)
                     {
                         count++;
                     }
                     else{
                         count=0;
                     }
                }
            }
        }
        if(count == pattern.length())
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}
