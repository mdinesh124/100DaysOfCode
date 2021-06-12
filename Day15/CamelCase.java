import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' )
            {
                if(s.charAt(i)<='Z')
                {
                count++;
                }
            }
        }
        System.out.println(count);
    }
}
