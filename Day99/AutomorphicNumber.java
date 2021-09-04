import java.util.*;
public class AutomorphicNumber  
{   
static boolean isAutomorphic(int n)   
{   
int square = n * n;     
while (n > 0)   
{   
if (n % 10 != square % 10)   
return false;   
n = n/10;   
square = square/10;   
}   
return true;   
}   
public static void main(String args[])   
{   
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt(); 
if(isAutomorphic(n))
{
    System.out.println("automorphic");
}
    else {
        System.out.println("not automorphic");
    }

}   
}  
