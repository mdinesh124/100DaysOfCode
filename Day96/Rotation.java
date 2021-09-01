import java.util.*;
public class Rotation    
{    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in); 
        String str1 = sc.nextLine(); 
        String str2 = sc.nextLine(); 
        if(str1.length() != str2.length()){    
            System.out.println("no rotation");    
        }    
        else {    
            str1 = str1.concat(str1);    
            if(str1.indexOf(str2) != -1)    
                System.out.println("rotation");    
            else    
                System.out.println("no rotation");    
        }    
    }    
}     
