import java.util.Scanner;

public class Project {
    public static void main(String[] args){
    int number = (int)(Math.random()*100);
    Scanner sc = new Scanner(System.in);
    int usernumber = 0;

    do{
        // System.out.println(number);  --> to know your number given input 
        System.out.println("Enter Your Number");
        usernumber = sc.nextInt();

        if (number == usernumber)
        {
            System.out.println("NUMBER IS CORRECT");
            break;
        }
            else if (usernumber > number) {
                System.out.println("Your number is Large");
            }

            else{
                System.out.println("Your number is two small");
            }
        


    } while(usernumber >= 0);

    System.out.println("Code Execution ended");
    }
    
}
