// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

// class Pattern1 {
//     public static void pat1(int n){
//            for (int i = 0; i < n ; i++){
//             for (int j = 0; j < n; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

    // class Pattern2 {
    // public static void pat1(int n){
    //        for (int i = 0; i < n ; i++){
    //         for (int j = 0; j <= i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // class Pattern3 {
    // public static void pat1(int n){
    //        for (int i = 0; i <= n ; i++){
    //         for (int j = 1; j <= i; j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    
// class Pattern4{
//     public static void pat1(int n){
//            for (int i = 0; i <= n ; i++){
//             for (int j = 1; j <= i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }

// class Pattern5 {
//     public static void pat1(int n){
//            for (int i = 0; i <= n ; i++){
//             for (int j = 1; j < n -  i+ 1; j++){
//                 System.out.print( "* ");
//             }
//             System.out.println();
//         }
//     }

// class Pattern6 {
//     public static void pat1(int n){
//            for (int i = 0; i <= n ; i++){
//             for (int j = 1; j < n - i+ 1; j++){
//                 System.out.print(j+  " ");
//             }
//             System.out.println();
//         }
//     }

// class Pattern7 {
//     public static void pat1(int n){
//            for (int i = 0; i < n ; i++){
//             // space
//             for (int j = 0; j < n - i - 1; j++){
//                 System.out.print(" ");
//             }
//                 // star
//                 for (int  j = 0; j < 2 * i + 1; j++){
//                         System.out.print("*");
//                 }
//                         // space
//                     for ( int j = 0; j< n - i - 1; j++){
//                         System.out.print(" ");
//                     }        
//             System.out.println();
//         }
//     }

// public class Pattern8 {
//     public static void pat1(int n){
//         for (int i = 0; i < n; i++)
//     {
//         // For printing the spaces before stars in each row
//         for (int j =0; j<i; j++)
//         {
//             System.out.print(" ");
//         }   
//         // For printing the stars in each row
//         for(int j=0;j< 2*n -(2*i +1);j++){         
//             System.out.print("*");
//         }      
//         // For printing the spaces after the stars in each row
//         for (int j =0; j<i; j++)
//         {
//             System.out.print(" ");
//         }
//         // As soon as the stars for each iteration are printed, we move to the
//         // next row and give a line break otherwise all stars
//         // would get printed in 1 line.
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many output needed: ");
//         n = sc.nextInt();
//         pat1(n);
// }
// }

// class Pattern9 {
//     public static void pat1(int n){
//            for (int i = 0; i < n ; i++){
//             // space
//             for (int j = 0; j < n-i-1; j++){
//                 System.out.print(" ");
//             }
//                 // star
//                 for (int  j = 0; j < 2*i+1; j++){
//                         System.out.print("*");
//                 }
//                         // space
//                     for ( int j = 0; j< i-n-1 ; j++){
//                         System.out.print(" ");
//                     }
//             System.out.println();
//         }
//     }
//     public static void pat2(int n){
//         for (int i = 0; i < n; i++)
//     {
//         // For printing the spaces before stars in each row
//         for (int j =0; j<i; j++)
//         {
//             System.out.print(" ");
//         }     
//         // For printing the stars in each row
//         for(int j=0;j< 2*n -(2*i +1);j++){          
//             System.out.print("*");
//         }       
//         // For printing the spaces after the stars in each row
//         for (int j =0; j<i; j++)
//         {
//             System.out.print(" ");
//         }     
//         // As soon as the stars for each iteration are printed, we move to the
//         // next row and give a line break otherwise all stars
//         // would get printed in 1 line.
//         System.out.println();
//     }
// }
//   public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many output needed: ");
//         n = sc.nextInt();
//         pat1(n);
//         pat2(n);   
//     }
// }

// public class Pattern11 {
//     public static void pat1(int n){
//         for (int i = 1; i <= 2*n-1; i++)
//     {
//         int star = i;
//         if ( i>n  ) star =2*n-i;
//         for(int j = 1; j<= star; j++)
//         {
//             System.out.print("*");
//         } 
//         System.out.println(); 
//     }
// }

public class Pattern {
    public static void pat1(int n){
        for (int i = 1; i <= 2*n-1; i++)
    {
        int star = i;
        if ( i>n  ) star =2*n-i;
        for(int j = 1; j<= star; j++)
        {
            System.out.print("*");
        } 
        System.out.println();
      
    }
}
public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many output needed: ");
        n = sc.nextInt();
        pat1(n);
}
}

