import java.io.*;
public class Fibo {

    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        
        return fib(n-1)+fib(n-2);
        
       
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.parseInt(br.readLine());
       for(int i =1;i<=n;i++){
           System.out.println(fib(i));
       }
    }
    
}
