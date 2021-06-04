/**
 * Given a string s, and a pattern p. You need to find if p exists in s or not and return the starting index of p in s. If p does not exist in s then -1 will be returned.
Here p and s both are case-sensitive.
 */
import java.util.*;

class Pattern {
    
    static void patSearch(String s, String p)
    {
        int pos = s.indexOf(p);
        
        while(pos >= 0)
        {
            System.out.print(pos + " ");
            pos = s.indexOf(p, pos + 1);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        
        patSearch(s, p);
    }
}

