import java.util.Scanner;


public class TheLetter {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();scan.nextLine();
        
        for(int i=0;i<T;i++)
        {
            String s = scan.nextLine();
            int count=0;
            for(int j=0;j<s.length()/2;j++)
                count+=Math.abs(s.charAt(j)-s.charAt(s.length()-1-j));
            System.out.println(count);
        }
    }
}
