import java.util.*;
public class Professor{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i = 0; i < n; i++)
        {
            if(a[i]<=0)
            {
                count++;
            }
        
            
        }
        if(count>= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

    }
}
}
