public class MyDeque<E>{
    private E[] data;
    private int size, start, end;

    public MyDeque(){  
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[10];
        data = d;
        start = 0;
        end = 0;
        size = 0;
    }

    public MyDeque(int initialCapacity){  
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[initialCapacity];
        data = d;
        start = 0;
        end = 0;
        size = 0;
    }

    public int size(){ 
        return size;
    }
    public String toString(){ 
        String result = "";
        return result;
    }
    public void addFirst(E element){ }
    public void addLast(E element){ }
    public E removeFirst(){ 
        return null;
    }
    public E removeLast(){ 
        return null;
    }
    
    public E getFirst(){ 
        return data[start];
    }
    public E getLast(){ 
        return data[end];
    }

}