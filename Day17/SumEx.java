import java.io.*;
import java.util.*;

class SumEx {
  
    public static void main (String[] args) {
    
       int a, b, sum;

       try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            sum=a+b;

            System.out.println("Addition is "+sum);
       }
       catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Insufficient nos.");
       }
    }
}