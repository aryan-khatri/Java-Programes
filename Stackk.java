import java.util.Stack;
public class Stackk {
    public static void main(String[] args){
        // so in stack push and pop method work in arraylist it add method working there but here push pop method working 
        // if you want to understand how this work first understand Stack hota kya ha then you will understand this

        Stack<String> Animals = new Stack<>();
        Animals.push("Lions");
        Animals.push("Monkey");
        Animals.push("Birds");
        Animals.push("Peakcock"); // its a 1 st value in stack
        System.out.println(Animals);

        Stack<Integer> number = new Stack<>();
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4); //its also a first value in stack 
        System.out.println(number);

        // peek funciton to check which value in top in stack 
        System.out.println(Animals.peek());
        System.out.println(number.peek());

        // pop so top element remove from stack 
        Animals.pop();
        System.out.println("Now Top on: " + Animals.peek());

        number.pop();
        System.out.println(number.peek());

        // its remove the top element you can see
        System.out.println(Animals);
        System.out.println(number);

    }
}
