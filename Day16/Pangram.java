import java.util.Scanner;
public class Pangram {
    public static boolean isPangram(String s) {
        boolean mark[] = new boolean[26];
        int j = 0;
        for(int i = 0; i <s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                j = s.charAt(i)-'a';
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                j = s.charAt(i)-'A';
            }
            else 
                continue;
            mark[j] = true;
            
        }
            for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
        return (true);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPangram(s)==true)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }

    }
}
