import java.util.*;
import java.io.*;
public class BalancedParanthesis {
   
   static boolean balanced (String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '('|| str.charAt(i) == '{' || str.charAt(i)=='[')
            {
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()==true)
                {
                    return false;
                }
            else if((matching(stack.peek(),str.charAt(i)))==false)
            {
                return false;
            }
            else{
                stack.pop();
            }
        }
            

        }
        return (stack.isEmpty()==true);
    }
   static boolean matching(char a, char b)
    {
        return (((a=='(')&&(b==')'))||((a=='{')&&(b=='}'))||((a=='[')&&(b==']')));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
     System.out.println(balanced(str));
    

    }
}
