import java.io.*;
import java.util.*;


public class Encapsulation {

   
    public static void main (String[] args) {
       
       Student s1 = new Student();
    	s1.setCGPA(9.7f);
    	
    	System.out.println(s1.getCGPA());
    }
}


class Student
{
	String name;
	private float CGPA;

     static int numberOfStudents;
     
	public float getCGPA(){
		return CGPA;
	}

	public void setCGPA(float newCGPA)
	{
		this.CGPA = newCGPA	;	
	}

	public static int getNumberofStudents()
	{
		return numberOfStudents;
	}
}