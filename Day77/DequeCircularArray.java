class Deque{
    int size,capacity,a[],front;
   
    Deque(int c){
        size=0;
        capacity = c;
        front = 0;
        a = new int[capacity];

    }
    void insertRear(int x)
    {
        if(isFull()) return ;
       int rear = (front+size) % capacity;
        a[rear]=x;
        size++;


    }
    void insertFront(int x)
    {
        if(isFull()) return ;
       front = (front+capacity-1) % capacity;
        a[front]=x;
        size++;


    }
     void queueDisplay()
    {
        int i;
        if (isEmpty()) {
            System.out.printf("\nQueue is Empty\n");
            return ;
        }
        for (i = 0; i < size; i++) {
            System.out.printf(" %d <-- ", a[i]);
        }
        return;
    }
    void deleteFront()
    {
        if(isEmpty()) return ;
        front = (front+1)%capacity;
        size--;

    }
    void deleteRear()
    {
        if(isEmpty()) return ;
        size--;
    }
    boolean isFull()
    {
        return (size==capacity);

    }
    boolean isEmpty()
    {
        return (size==0);

    }
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return front;
        }

    }
    int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return (front+size-1)%capacity;
        }

    }
    
}
public class DequeCircularArray {
    public static void main(String[] args) {
        Deque q = new Deque(5);
        
        q.insertRear(10);
        q.insertFront(20);
        q.insertFront(30);
        q.insertRear(40);
        q.deleteRear();
        q.deleteFront();
        q.queueDisplay();
        System.out.println();
    }
}
