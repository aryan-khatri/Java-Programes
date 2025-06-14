import java.util.HashSet;
import java.util.Set;
public class Hashset {
    public static void main(String [] args){
        Set<Integer> list = new HashSet <> ();
        list.add(12);
        list.add(18);
        list.add(16);
        list.add(14);
        list.add(14); //this will not print
      
        System.out.println(list);

        // remove 
        list.remove(12);

        // contain bullean value
        System.out.println(list.contains(12));

        // isempty function
        System.out.println(list.isEmpty());

        // size
        System.out.println(list.size());

        // clear
        list.clear();

        System.out.println(list);

    }
}
