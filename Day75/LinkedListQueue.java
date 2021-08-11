import java.util.*;
import java.io.*;
class Node { 
	int data; 
	Node next; 

	 
	public Node(int x) 
	{ 
		data = x;
		next = null; 
	} 
} 


class Queue { 
	Node front, rear; 

	public Queue() 
	{ 
		front = rear = null; 
	} 

	
	void enqueue(int x) 
	{ 

		
		Node temp = new Node(x); 

		
		if (rear == null) { 
			front = rear = temp; 
			return; 
		} 

		
		rear.next = temp; 
		rear = temp; 
	} 

	 
	void dequeue() 
	{ 
		
	if (front == null) 
			return; 

		
		Node temp = front; 
		front = front.next; 

		
		if (front == null) 
			rear = null; 
	} 
} 

 
public class LinkedListQueue { 
	public static void main(String[] args) 
	{ 
		Queue q = new Queue(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(4); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Front : " + q.front.data); 
		System.out.println("Rear : " + q.rear.data); 
	} 
} 

