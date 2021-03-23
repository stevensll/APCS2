import java.util.NoSuchElementException;
import java.util.Arrays;
public class MyDeque<E>{
    private E[] data;
    private int size, start, end;

    public MyDeque(){  
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[10];
        data = d;
        start = 0;
        end = -1;
        size = 0;
    }

    public MyDeque(int initialCapacity){  
        if(initialCapacity < 10) initialCapacity = 10;
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[initialCapacity];
        data = d;
        start = 0;
        end = -1;
        size = 0;
    }

    public int size(){ 
        return size;
    }
    public String toString(){
        if(size == 0) return "{}"; 
        String result ="{";
        for(int i = 0; i < this.size()-1; i++){
            if(start+i >= data.length){
                result+= data[start+i-data.length].toString() + ", ";
            } else result+= data[start+i].toString()+", ";
        }
        result+= data[end].toString()+"}";
        return result;
    }
    /*
    Remove/Get (both first and last) will throw: NoSuchElementException - when this deque is empty

Add (both first and last) will throw: NullPointerException - if the specified element is null (this deque does not permit null elements)
    */
    public void addFirst(E element) throws NullPointerException{
        if(element == null) throw new NullPointerException("cannot add a null element");
        if(size == 0){
            end++;
            size++;
            data[start] = element;
        } else if(size == data.length){
            //resize and add to end. + 1 for resizing a 0 size array.
            data = resizedArray(this, (this.size() + 1) * 2);
            size++;
            start = data.length-1;
            data[start] = element;
        //wrap around if no space in data
        } else if(start == 0){
            start = data.length-1;
            size++;
            data[start] = element;
        } else {
            size++;  
            start--;
            data[start] = element;
        }
    }
  
    public void addLast(E element) throws NullPointerException{ 
        if(element == null) throw new NullPointerException("cannot add a null element");
        if(size == data.length){
            //resize and add to end. + 1 for resizing a 0 size array.
            data = resizedArray(this, (this.size() + 1) * 2);
            size++;
            end++;
            data[end] = element;
        //wrap around if no space in data
        } else if(end == data.length-1){
            end = 0;
            size++;
            data[end] = element;
        } else {
            size++;
            end++;
            data[end] = element;
        }
    }

    public E removeFirst(){
        E temp = data[start];
        data[start] = null;
        size--;
        start++;
        return temp;
    }

    public E removeLast(){
        E temp = data[end];
        data[end] = null;
        size--;
        end--;
        return temp;
    }
    //Remove/Get (both first and last) will throw: NoSuchElementException - when this deque is empty

    public E getFirst () throws NoSuchElementException{ 
        if(size == 0) throw new NoSuchElementException("deque is empty with size 0");
        return data[start];
    }
    public E getLast() throws NoSuchElementException{ 
        if(size == 0) throw new NoSuchElementException("deque is empty with size 0");
        return data[end];
    }

    //resizes the deque array with a new capacity and flushes all elements to the left
    private E[] resizedArray (MyDeque<E> deque, int newCapacity){
        @SuppressWarnings("unchecked")
        E[] resized = (E[])new Object[newCapacity];
        for(int i = 0; i < this.size(); i++){
            if(start+i >= deque.data.length){
                resized[i] = deque.data[start+i-data.length];
            } else resized[i] = deque.data[start+i];
        }
        start = 0;
        end = this.size()-1;
        return resized;
    }

}