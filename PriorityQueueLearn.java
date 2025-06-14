import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueLearn {
    public static void main(String[] args){
        Queue<Integer> list = new PriorityQueue<>();
        // Queue<Integer> list = new PriorityQueue<>(); 
        // both are same library you can suppose 
        list.offer(50);
        list.offer(20);
        list.offer(40);
        list.offer(30);
        System.out.println(list);

        // In priority. poll properties change. in priority poll check for which is important which is priority that will remove from list 
        list.poll();
        System.out.println(list);

        // same peek function what is next number
        System.out.println(list.peek());
        list.peek();
        System.out.println(list);

        // now we want first remove greator number convert into max heap.
        PriorityQueue<Integer> List = new PriorityQueue<>(Comparator.reverseOrder());
        List.offer(2);
        List.offer(4);
        List.offer(3);
        List.offer(1);
        System.out.println(List);
        System.out.println(List.poll()); // 4 remove as prirority
        System.out.println(List);












    }
}
