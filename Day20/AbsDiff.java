//Solution 1
/*import java.util.*;
public class AbsDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int min=0,sol=0;
         min = (int)Math.abs(a[0]-a[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j=1;j<n;j++)
            {
                if(j!=i){
               
               sol=(int)Math.abs(a[i]-a[j]);
                
                if(sol<min)
                {
                   min = sol;
                }
            }
            
            }
        }
        System.out.println(min);
    }
}*/

//Solution 2
import java.util.*;
public class AbsDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int min=0,sol=0;
        Arrays.sort(a);
         min = a[n-1]-a[0];
        for(int i = 0; i < n-1; i++)
        {
            sol = a[i+1]-a[i];
            if(sol<min)
            {
                min = sol;
            }
        }
        System.out.println(min);
    }
}

