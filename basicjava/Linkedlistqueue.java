import java.util.Queue;
import java.util.LinkedList;
public class Linkedlistqueue {
    public static void main(String[] args){
        Queue<Integer> list = new LinkedList<>();

        //  method 1 offer
        list.offer(12); // in queue this is 1 st function
        list.offer(13);
        list.offer(14);
        list.offer(15);
        list.add(12); // same like offer but not good in queue
        System.out.println(list);

        // poll function remove 1st function list.poll();
        System.out.println(list.poll());


        System.out.println(list); 

        // top element in function
        System.out.println(list.peek());

        // remove , element



        



    }
}
