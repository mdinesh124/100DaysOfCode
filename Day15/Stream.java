import java.io.*;
import java.util.*;
import java.util.function.*;




class Stream {
  
	public static void main (String[] args) {
	
	 int arr[]={30,20,10};
	 
	 int max=Arrays.stream(arr).max().getAsInt();
	 
	 System.out.println(max);
	 

	}
	
}