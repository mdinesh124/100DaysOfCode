import java.util.*;
import java.io.*;
import java.lang.*;
class Deletion
{ 
    static int delete(int arr[], int n, int x)
    {
    	int i = 0;

    	for(i = 0; i < n; i++)
    	{
    		if(arr[i] == x)
    			break;
    	}

    	if(i == n)
    		return n;

    	for(int j = i; j < n - 1; j++)
    	{
    		arr[j] = arr[j + 1];
    	}

    	return n-1;
    } 

    public static void main(String args[]) 
    { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
          arr[i] = sc.nextInt();
      }
      int x = sc.nextInt();


     

       System.out.println("Before Deletion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();
       

       n = delete(arr, n, x);

       System.out.println("After Deletion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}
