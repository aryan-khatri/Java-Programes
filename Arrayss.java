import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        // NOTE: This file includes multiple small programs for learning purposes.
        // It's best to run one logical section at a time to avoid confusion or conflicts in execution.

        // ----------------------- ARRAY BASICS -------------------------
        // Create an array of marks
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 50;

        // Print the last element of the array
        System.out.println("Last mark: " + marks[4]);

        // Print the length of the array
        System.out.println("Length of marks array: " + marks.length);

        // ------------------- SORTING AN ARRAY -------------------------
        // Sorting the array and checking how it changes a specific index
        System.out.println("Before sorting, marks[2]: " + marks[2]);
        Arrays.sort(marks);
        System.out.println("After sorting, marks[2]: " + marks[2]);

        // --------------------- 1D ARRAY (ALTERNATE WAY) ----------------
        int[] markss = {90, 80, 98, 89};
        System.out.println("First element of markss: " + markss[0]);

        // ---------------------- 2D ARRAY -------------------------------
        int[][] finalMarks = {{97, 98, 95},{95, 95, 98}};

        // Accessing 2D array element
        System.out.println("Element at [0][1] in finalMarks: " + finalMarks[0][1]);

        // ---------------------- TYPE CASTING ---------------------------
        // There are two types of type casting:
        // 1. Implicit Casting (automatically done by Java)
        // 2. Explicit Casting (done manually)

        // Implicit Casting Example:
        double price = 122.00;
        double finalPrice = 18;
        System.out.println("Final price: " + finalPrice);

        // Explicit Casting Example:
        int p = 188;
        // Adding a double to an int requires explicit casting
        int fp = p + (int)12.2;  // 12.2 is cast to 12
        System.out.println("Total after casting: " + fp);

        // ---------------------- FINAL KEYWORD --------------------------
        // 'final' is used to declare constants (fixed values)

        final float pi = 3.14F;  // This value cannot be changed later
        // pi = 1.1F; // This will cause an error because pi is final

        System.out.println("Value of pi (constant): " + pi);
    }
}
