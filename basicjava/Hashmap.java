import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public static void main(String [] args)
    {
        Map<String, Integer> map = new HashMap();

        // use put function to store alue in map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("three", 3); //this value is not print because of hash properties 
        map.put("three", 4); // now it will override the value by itself now it store the value key three value 4 
        System.out.println(map);


        // if key is absent it print or add the value override nhi hogi value 
        map.putIfAbsent("four", 4);

        // contain isEmpty same function same ha clear

        // iterator

        for (Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }


        System.out.println(map);



    }
}
