import java.util.Scanner;
public class PDFviewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h[] = new int[26];
        for(int i=0; i<26;i++)
        {
            h[i] = sc.nextInt();
        }
        String s = sc.next();
        int letter = (int)s.length();
        int max = h[0];
        int j = 0;
        for(int i = 0; i <s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                j = s.charAt(i)-'a';
                if(h[j]>max)
                {
                    max = h[j];

                }
            }
            
    }
    System.out.println(max*letter);
    
}
}
