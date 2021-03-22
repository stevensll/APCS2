public class StevenDequeTester {
    public static void main(String[] args) {
        MyDeque<Integer> zahando = new MyDeque<Integer>();
        System.out.print(zahando.size());
        for(int i = 0; i < 15; i++){
            zahando.addLast(i);
            System.out.println(zahando);
            System.out.println(zahando.getFirst());
            System.out.println(zahando.getLast());
        }
    }
}
