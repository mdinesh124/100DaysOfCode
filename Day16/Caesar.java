




import java.util.Scanner;
public class Caesar {
	static String small = "abcdefghijklmnopqrstuvwxyz";
		static String large = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str= sc.next();
        int k = sc.nextInt();
		char c;
		
		for(int i=0;i<str.length();i++)
		{
			 c = str.charAt(i);
			int index = small.indexOf(c);
			if(index>-1)
			{
			c = small.charAt(((index+k)%small.length()));
			}
			index = large.indexOf(c);
			if(index>-1)
			{
			c = large.charAt(((index+k)%large.length()));
			}

			System.out.print(c);
		}
		
}
}












