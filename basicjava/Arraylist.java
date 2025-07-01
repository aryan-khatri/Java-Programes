import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class Arraylist {
    public static void main(String[] args){
        
        String[] stud = {"aryan", "anshul"};
        System.out.println("Index 0 value: "+stud[0]);
        System.out.println();

        char[] names = {'A', 'r', 'y', 'a', 'n'};
        String result = new String(names);
        System.out.println("Your name came here without space: "+result);
        System.out.println("Index 0: "+names[0]);
        System.out.println();



        // array list
        List<String> student = new ArrayList<>();
        ArrayList<Integer> name = new ArrayList<>();
        student.add("aryan");
        name.add(1);
        System.out.println("String "+student);
        System.out.println("Integer"+name);
        System.out.println();


        // add any numebr in array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // minimum and maximum number finding through collection framework
        System.out.println("min nuber: " + Collections.min(list));
        System.out.println("max nuber: " + Collections.max(list));
        System.out.println();


        // how many times same element is there frequency works
        System.out.println("How many times number 4 is there: " + Collections.frequency(list, 4));
        System.out.println();


        // reverse order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("reverse order of element: " + list);
        System.out.println();


        // element is already sorted but if not like element is like this 2,4,3,1 unsorted array so you can sort the array as well using collection method - Collections.sort(list);
        Collections.sort(list);
        System.out.println("sorted element"+list);
        System.out.println();


        // add element index wise at index 1 it add 50
        list.add(1, 50);
        System.out.println(list);
        System.out.println();


        // how to add any number in current array 
        ArrayList<Integer> NewList = new ArrayList<>();
        NewList.add(10);
        NewList.add(20);
        list.addAll(NewList);
        System.out.println(list);
        System.out.println();


        // get function to get index value 
        System.out.println(list.get(1));
        System.out.println();


        // remove function to remove element of array
        list.remove(1);
        System.out.println(list);
        System.out.println();


        // remove the value itself in array 
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        System.out.println();


        // set funtion update index value 
        list.set(1, 16);
        System.out.println(list);
        System.out.println();


        // checking the values exist in array or not 
        System.out.println(list.contains(20));
        System.out.println();


        // iteration function using list.size
        for (int i = 0; i< list.size(); i++) 
        System.out.println("Value in element is " + list.get(i));
        System.out.println();


        // clear function cleaer everything from array list
        list.clear();
        System.out.println(list);

    }
}
