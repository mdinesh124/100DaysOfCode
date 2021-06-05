import java.util.*;
import java.io.*;




class Jagged 
{ 

	public static void main(String args[]) 
    {
    	int arr[][] = {{1, 3, 6, 9, 10},
    				   {2, 3, 1}};

    	for(int i = 0; i < arr.length; i++)
    	{
    		for(int j = 0; j < arr[i].length; j++)
    		{
    			System.out.print(arr[i][j] + " ");
    		}
    	}
    } 

}