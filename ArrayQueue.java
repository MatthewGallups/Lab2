class ArrayQueue<E> {

    private E[]data;
    private int f = 0;
    private int sz = 0;

public void ArrayQueue(Object CAPACITY) {this(CAPACITY);}
public void ArrayQueue(int capacity) {
    data = (E[]) new Object[capacity];
}
public int size() { return sz; }
public boolean is_Empty(Object CAPACITY) { return (sz==0;)}
public void enqueue(E e)throws illegalStateException{
    if (sz == data.length) throw new illegalStateException("Queue is full");
    int avail = (f + sz) % data.length;
    data[avail] = e;
    sz++;
}
public E first() {
    if (is_Empt
public E first() {
    if (is_Empty())return null;
    return data[f];
}
public E dequeue() {
    if (isEmpty()) return null;
    E answer = data[f];
    data[f] = null;
    f=(f+1) % data.length;
    sz--;
    return answer;
}

ArrayQueue<Integer> queue = new ArrayQueue<Integer>()

