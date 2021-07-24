import java.util.*;

public class CommonChild {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();   
		char[] s1 = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			s1[i] = str1.charAt(i);
		}
        char[] s2 = new char[str2.length()];

		for (int i = 0; i < str2.length(); i++) {
			s2[i] = str2.charAt(i);
		}
        int count=0;
        for(int i=0;i<str1.length() && i<str2.length();i++){

		if(s1[i] == s2[i])
        {
            count++;
        }
    }
        System.out.println(count);
	}
}
