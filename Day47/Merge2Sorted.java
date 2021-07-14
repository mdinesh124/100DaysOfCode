import java.util.*;

class Merge2Sorted
{
    public static void main (String[] args) 
    {
        
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i =0;i<m;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i =0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        merge(m,a,n,b);
        
    }
    
    static void merge(int m,int a[],int n, int b[]){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<m)
            System.out.print(a[i++]+" ");
        while(j<n)
            System.out.print(b[j++]+" ");    
    }
}
