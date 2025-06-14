import java.util.ArrayDeque;
public class Arraydeque {
    public static void main(String[] args){
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.offer(45);
        // list.offer(45);
        // list.offer(45);
        // list.offer(45);

        // offer first first element of list
        list.offerFirst(12);

        // offer first last element of list
        list.offerLast(23);
        list.offer(10); //its come in last of the list because it after the last function
        System.out.println(list);

        // peek and poll function same ha 

        // difference is this here you can implement these also 

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        System.out.println("poll "+list);

        System.out.println(list.pollFirst());
        System.out.println("poll first"+list);
        
        System.out.println(list.pollLast());
        System.out.println("poll last"+list);





    }
}
