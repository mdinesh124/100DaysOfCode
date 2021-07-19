import java.util.*;
class RadixSort
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        radixsort(n, arr); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void countingSort(int n,int arr[],  int exp) 
    { 
        int[] output=new int[n];  
        int[] count=new int[10]; 
        for (int i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
      
        for (int i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
      
        for (int i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
      
        for (int i = 0; i < n; i++) 
            arr[i] = output[i]; 
    }
    
    public static void radixsort(int n,int arr[]) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
      
        for (int exp = 1; mx / exp > 0; exp *= 10) 
            countingSort( n,arr, exp); 
    }
}
