class Deque{
    int size,capacity,a[];
   
    Deque(int c){
        size=0;
        capacity = c;
        a = new int[capacity];

    }
    void insertRear(int x)
    {
        if(isFull()) return ;
        a[size]=x;
        size++;


    }
    void deleteRear()
    {
        if(isEmpty()) return ;
        size--;
    }
     void queueDisplay()
    {
        int i;
        if (isEmpty()) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = 0; i < size; i++) {
            System.out.printf(" %d <-- ", a[i]);
        }
        return;
    }
    void deleteFront()
    {
        if(isEmpty()) return ;
        for(int i=0;i<size-1;i++){
            a[i] = a[i+1];
        }
        size--;


    }
    void insertFront(int x)
    {
        for(int i=size-1;i>=0;i--)
        {
            a[i+1] = a[i];
        }
        a[0] = x;
        size++;
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
            return 0;
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
            return size-1;
        }

    }
    
}
public class DequeArray {
    public static void main(String[] args) {
        Deque q = new Deque(4);
        q.insertFront(10);
        q.insertRear(20);
        q.insertFront(30);
        q.insertRear(50);
        q.deleteFront();
        q.deleteRear();
        q.queueDisplay();
        System.out.println();
    }
}
