import java.util.Scanner;
public class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int k = sc.nextInt();
		String strIncremented=new String(); 
		for(int i=0;i<str.length();i++){ 
			strIncremented+=(char)(str.charAt(i)+k); 
            if(str.charAt(i)=='#'||'$'||'%'||'^'||'&'||'*'||'('||')'||'-'||'+')
		} 
		System.out.println(strIncremented); 
}
}
