import java.io.*;
import java.util.*;

class Throw{
   
    public static void main (String[] args) {
    
        try{
                methodA();

                 System.out.println("Exit TRY of main()");

           }
           catch(ArithmeticException ex)
           {
                 System.out.println("ArithmeticException caught ...");

                 ex.printStackTrace();
           }

           System.out.println("Exit main() successfully");
    }

     static void methodA()throws ArithmeticException
    {

        

        Scanner in = new Scanner(System.in);

        int a = 5, b = 0, c;
        
        System.out.println("Enter numeric value for variable b");
        
        b = in.nextInt();

        if(b==0)
            throw new ArithmeticException();
        else
            c = a / b;

        System.out.println("Exit methodA()");
    }
}
