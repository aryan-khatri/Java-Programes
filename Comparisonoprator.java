import java.util.Scanner;
public class Comparisonoprator {
    public static void main(String[] args){
            // Comparison operator
    // a == b =  true/false
    // a!=b true/false
    // a < b
    // a > b
    // a <= b
    // a >= b
    // && , ||, !

    // statement 
    // if, else if, else, switch 

    // loop
    // for, while, do while, nested


    // for (int i = 100; i <= 50; i = i+1){
    // System.out.println(i);
    // }


    // for (int i = 1; i <= 50; i++){
    // System.out.println("Value is: " + i);
    // }


    // int i = 1;
    // while( i <= 50)
    // {   
    //     System.out.println(i);
    //     i++; 
    // }


    // int i = 1;
    // while (i <= 10) {
    //     System.out.println("Output is: " + i);
    //     i++;
    // }
    
    // int k = 1;
    // do{
    //     System.out.println(k);
    //     k++;
    // } while (k <= 20);
    
    
    // }

    int i = 0;

    do{
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("Your number is: " + i);
    } while(i >= 0);
    System.out.println("The End");



}
}
