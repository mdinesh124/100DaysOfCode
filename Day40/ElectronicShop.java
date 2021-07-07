import java.io.*;
import java.util.*;

public class ElectronicShop{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyboards = new int[n];
        for(int i=0; i < n; i++){
            keyboards[i] = sc.nextInt();
        }
        int[] pendrives = new int[m];
        for(int j=0; j < m; j++){
            pendrives[j] = sc.nextInt();
        }
        
        int ans = -1;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<m;j++)
                {
                int v = keyboards[i]+pendrives[j];
                if(v>ans && v<= s)
                    {
                    ans = v;
                }
            }
        }
        
        System.out.println(ans);
    }
}
