import java.util.*;
public class RemoveSpace {    
    public static void main(String[] args) {    
            Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();  
            

        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println(str1);    
    }    
}    