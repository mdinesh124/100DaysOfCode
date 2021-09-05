import java.util.*;
public class FascinatingNum{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int  n2, n3;        
n2 = num * 2;  
n3 = num * 3;  
String con = num + "" + n2 + n3;  
boolean found = true;   
for(char c = '1'; c <= '9'; c++)  
{  
int count = 0;  
for(int i = 0; i < con.length(); i++)  
{  
char ch = con.charAt(i);  
if(ch == c)  
count++;  
}   
if(count > 1 || count == 0)  
{  
found = false;  
break;  
}  
}  
if(found)  
System.out.println("fascinating number.");  
else  
System.out.println("not a fascinating number.");  
    }
}
