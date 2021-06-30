import java.util.Scanner;
class AdjacentDup
{
    public static String removeDuplicates(char[] chars)
    {
        char prev = '\0';
        int k = 0;
 
        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }
 
        return new String(chars).substring(0, k);
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        s = removeDuplicates(s.toCharArray());
        System.out.println(s);
    }
}