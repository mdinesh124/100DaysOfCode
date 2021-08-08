class Stack{
int capacity;
int top;
int arr[];
int p;
    Stack (int s)
    {
         top = -1;
         capacity = s;
        arr = new int[capacity];
    }
    void push(int x)
    {
        if(capacity-1==top)
        {
            System.out.println("overflow,element cannot be inserted");
        }
        top++;
        arr[top] = x;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("underflow, deletion not possible");
        }
        else{
         p = arr[top];
        top--;
        }
        return p;
        
    }
    int peek()
    {
        return arr[top];
    }
    int size()
    {
        return top+1;
    }
    
}
public class PushPopStack {
    public static void main(String[] args) {
        Stack ob = new Stack(10);
        ob.push(10);
        ob.push(20);
        ob.push(40);
        System.out.println(ob.pop());
        System.out.println(ob.size());
        System.out.println(ob.peek());
    }
}
