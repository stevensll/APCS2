import java.util.NoSuchElementException;
import java.util.ArrayDeque;
public class StevenDequeTester {
    public static void main(String[] args) {
        System.out.println(test6(100000000));
        MyDeque<Integer> zahando = new MyDeque<Integer>(1);
        // for(int i = 0; i < 10000; i++){
        //     zahando.addFirst(i);
        // }
        // try{
        //     zahando.getLast();
        //     System.out.println("did not catch no element error");

        // } catch (NoSuchElementException e) {
        //     System.out.println("caught no element error");
        // }
        // try{
        //     zahando.getFirst();
        //     System.out.println("did not catch no element error");

        // } catch (NoSuchElementException e) {
        //     System.out.println("caught no element error");
        // }
        // zahando.addFirst(3);
        // System.out.println(zahando);
        // System.out.println(zahando);
        // for(int i = 0; i < 30; i++){
        //     zahando.addLast(i);
        // }
        // System.out.println(zahando);
        // for(int i = 0; i < 10; i++){
        //     zahando.removeFirst();
        // }
        // System.out.println(zahando);
        // for(int i = 0; i < 11; i++){
        //     zahando.addLast(i+100);
        // }
        // System.out.println(zahando);
        // System.out.println(zahando.getFirst() +" "+ zahando.getLast());
        // for(int i = 0; i < 30; i++){
        //     zahando.addFirst(i);
        // }
        // System.out.println(zahando);
        // System.out.println(zahando.getFirst() +" "+ zahando.getLast());
        // for(int i = 0; i < 10; i++){
        //     zahando.removeLast();
        // } 
        // System.out.println(zahando);
        // for(int i = 0; i < 11; i++){
        //     zahando.addFirst(i+100);
        // }
        // System.out.println(zahando);
        // System.out.println(zahando.getFirst() +" "+ zahando.getLast());

    }
    public static boolean equals(MyDeque<Integer>a, ArrayDeque<Integer>b){
        if(a==null && b==null)
          return true;
        if(a==null || b==null)
            return false;
        if(a.size()!=b.size())
          return false;
        if(a.size()==0 && b.size()==0)
          return true;
    
        try{
          while(b.size()>0){
            if(!a.removeFirst().equals(b.removeFirst())){
              return false;
            }
          }
        }catch(NoSuchElementException e){
          return false;
        }
        return b.size()==0;
      }
    
      public static int test6(int max){
        MyDeque<Integer> a = new MyDeque<Integer>();
        ArrayDeque<Integer>b = new ArrayDeque<Integer>();
    
        for(int i = 0; i < max; i++){
          int op = (int)(Math.random()*4);
          if(op == 0){
            a.addLast(i);
            b.addLast(i);
          }
          if(op == 1){
            a.addFirst(i);
            b.addFirst(i);
          }
          if(op == 2){
            if(b.size()>0){
              if(! a.getLast().equals(b.getLast())){
                System.out.println("Fail test6a "+a.getLast()+" vs "+b.getLast());
                return 0;
              }
              a.removeLast();
              b.removeLast();
            }
          }
          if(op == 3){
            if(b.size()>0){
              if(! a.getFirst().equals(b.getFirst())){
                System.out.println("Fail test6a "+a.getFirst()+" vs "+b.getFirst());
                return 0;
              }
              a.removeFirst();
              b.removeFirst();
            }
          }
        }
        if( equals(a,b) ){
          System.out.println("good");
          return 1;
        }
        System.out.println("Fail test6 end");
        return 0;
    }
}
