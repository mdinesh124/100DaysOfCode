import java.io.*;
import java.util.*;

class Test extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Test Thread");
        }
    }
}

public class MainThread {

   
    public static void main (String[] args)throws InterruptedException {
       
        Test t = new Test();

        t.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Main Thread");

            Thread.sleep(1);
        }
    }
}