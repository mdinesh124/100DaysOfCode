import java.util.*;
import java.lang.*;
public class Encryption {    
    public static void main(String[] args) {    
            Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();  
            

        str1 = str1.replaceAll("\\s+", "");    
        int len1 = str1.length();
        int sqroot = (int)Math.sqrt(len1);
        int row = (int)Math.floor(sqroot);
        int col = (int)Math.ceil(sqroot);
        if(row * col < len1)
            row = col;
        String res = "";
        for(int i=0;i<col;i++)
        {
            for(int j=i;j<len1;j = j+col)
            {
                res += str1.charAt(j);
            }
            res += " ";
        }
        System.out.println(res);


    }    
}  
