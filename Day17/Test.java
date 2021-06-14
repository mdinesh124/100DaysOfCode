import java.io.*;
import java.util.*;

class Test {
  
    public static void main (String[] args) {
    
        try{
                Scanner sc = new Scanner(new File("test.in"));


                System.out.println("Exit main()");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not Found caught");
        }
        finally{

                System.out.println("finally-block runs regardless of the state of exception");
        }
    }
}