import java.util.Scanner;
public class Sets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for(int j = 0; j < m; j++)
        {
            b[j] = sc.nextInt();
        }
        int count=0,c1=0,ans=0;
        
        for(int k=a[n-1];k<=b[0];k++)
        {
            
                for(int i = 0;i<n;i++)
                {
                    if(k%a[i]==0)
                    {
                        count++;
                    }
                }
            
        
        if(count == n)
        {
        for(int j=0;j<m;j++)
        {
            
                if(b[j]%k==0)
                {
                    c1++;
                }
            
        }
        if(c1==m)
        {
            ans++;
        }
    }
        
        count = 0;
        c1 = 0;
}
    System.out.println(ans);
        

    }
}
