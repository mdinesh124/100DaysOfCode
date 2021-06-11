import java.io.*;
import java.util.*;
import java.util.function.*;

class MethodReference {
   
	public static void main (String[] args) {
	
		List<Integer> al= new ArrayList<>(Arrays.asList(10,20,15,16));
		
		al.forEach(System.out::println);
	}
}
