import java.util.TreeSet;
import java.util.Set;

public class treeset {
    public static void main(String [] args){
        // value print in sorted like number by number samll then greator then greator order maintain but same element will remove 
        Set<Integer> list = new TreeSet <> ();
        list.add(12);
        list.add(18);
        list.add(16);
        list.add(14);
        list.add(14);  
        
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
