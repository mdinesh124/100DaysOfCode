import java.io.*;
import java.util.*;
import java.util.function.*;

class Case {
   
	public static void main (String[] args) {
	
	String a[] = {"This","IS","JAVA"};
	String b[] = {"ThIs","is","Java"};
	
	if(Arrays.equals(a,b,String::compareToIgnoreCase))
	    System.out.println("Yes");
	
	else
	    System.out.println("No");
	
	}
	
}
