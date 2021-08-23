import java.util.*;
import java.io.*;
import java.lang.*;
  
class BuildHeap {
    
    public static class MinHeap{
        int arr[];
        int size;
        int capacity;
        
        MinHeap(int c){
        size = 0; 
        capacity = c; 
        arr = new int[c];
        }
    
        int left(int i) { return (2*i + 1); } 
        int right(int i) { return (2*i + 2); } 
        int parent(int i) { return (i-1)/2; } 
    
    public void minHeapify(int i) 
    { 
    int lt = left(i); 
    int rt = right(i); 
    int smallest = i; 
    if (lt < size && arr[lt] < arr[i]) 
        smallest = lt; 
    if (rt < size && arr[rt] < arr[smallest]) 
        smallest = rt; 
    if (smallest != i) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[smallest]; 
        arr[smallest] = temp; 
        minHeapify(smallest); 
    } 
    }
    
    public void buildHeap1(){
        for(int i=(size-2)/2;i>=0;i--)
            minHeapify(i);
    }
    
    }
    public static void main(String args[]) 
    { 
        MinHeap h=new MinHeap(11);
    } 
   
} 