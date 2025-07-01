// // import java.util.Scanner;
// import java.util.*;
// public class function {
//     public static void myName(int n){
//         for(int i = 1; i<=n; i++){
//             if(n == 6){
//         System.out.println(n);
//             return;
//          }
//         }
         
//         myName(n);
        
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // System.out.println("My name is" + name);
//         myName(n);

//     }
// }

// import java.util.*;
// public class function{
//     public static int csum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = csum(a,b);
//         System.out.println(sum);



//     }
// }

// import java.util.*;
// public class function{
//     public static int csum(int a, int b){
//         // int sum = a+b;
//         // return sum;
//         return a*b;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // int sum = csum(a,b);
//         System.out.println(csum(a, b));



//     }
// }

// import java.util.*;
// public class function{
//     public static void printfactorial(int n){
//         int fact = 1;
//         for(int i=n; i>=1; i--){
//             fact = fact * i;
//         }
//             System.out.println(fact);
//             return; //break condition
        
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         printfactorial(n);



//     }
// }

// import java.util.*;
// with global with para meter
// public class function{
//     static int cnt =0;
//     public static void count(int cnt ){
//         //  int cnt = 0;
//         {
//         if (cnt == 3) return;
//         System.out.println(cnt);
//         cnt++;
//         count(cnt);
//         }
        
//     }
//     public static void main(String[] args){
//         // Scanner sc = new Scanner (System.in);
//         // int n = sc.nextInt();
//         // printfactorial(n);
//         count(0);
//     }
// }

// using global variable with no parameter
import java.util.*;
public class function{
    static int cnt =0;
    public static void count(){
        //  int cnt = 0;
        {
        if (cnt == 3) return;
        System.out.println(cnt);
        cnt++;
        count();
        }
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // printfactorial(n);
        count();
    }
}