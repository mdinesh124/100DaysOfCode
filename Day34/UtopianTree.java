import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UtopianTree
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        
        int testCount = Integer.parseInt(bufferedReader.readLine());
        
        while(testCount-- > 0)
        {
            printWriter.println(getAnswer(Integer.parseInt(bufferedReader.readLine())));
        }
        
        printWriter.flush();
    }

    private static long getAnswer(int n)
    {
        long h = 1;
        
        for(int i = 1 ; i <= n ; i++)
        {
            if(i % 2 != 0)
                h *= 2;
            else
                h +=1 ;
        }
        
        return h;
    }
}