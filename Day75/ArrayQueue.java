class Queue{
    int size,capacity,a[];
   
    Queue(int c){
        size=0;
        capacity = c;
        a = new int[capacity];

    }
    void enqueue(int x)
    {
        if(isFull()) return ;
        a[size]=x;
        size++;


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
    void dequeue()
    {
        if(isEmpty()) return ;
        for(int i=0;i<size-1;i++){
            a[i] = a[i+1];
        }
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
public class ArrayQueue {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.queueDisplay();
        System.out.println();
        q.dequeue();
        q.queueDisplay();
        System.out.println();
        System.out.println(q.getRear());
        System.out.println(q.getFront());
    }
}
