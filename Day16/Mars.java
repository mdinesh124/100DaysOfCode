import java.util.Scanner;
public class Mars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int count = 0;
        for(int i =0;i<len;i++)
        {
            if(i%3==1)
            {
            if(s.charAt(i)!='O')
            {
                count++;
            }
            }
            else
            {
                if(s.charAt(i)!='S')
                {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
