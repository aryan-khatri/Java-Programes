public class Datatypes {
    public static void main(String[] args) {

        // ------------------- PRIMITIVE DATA TYPES -------------------

        byte age = 20;                 // 1 byte memory: range from -128 to 127
        long phone = 12345678901212L;  // 8 bytes memory (not 2) — always add 'L' at the end
        int i = 10;                    // 4 bytes
        float pi = 3.21F;              // 4 bytes — use 'F' to indicate a float value
        double zi = 12345678901212D;   // 8 bytes — use 'D' for clarity (optional)
        char letter = 'a';            // 2 bytes — stores a single character
        boolean isAdult = true;       // 1 bit (Java internally handles it as 1 byte)

        // ------------------- NON-PRIMITIVE DATA TYPES -------------------

        // Strings (non-primitive type)
        String name = "Aryan";

        // Get string length using `.length()`
        System.out.println("Length of name: " + name.length());

        // Creating a string using constructor
        String friend = new String("Aryan");
        System.out.println("Length of friend: " + friend.length());

        // String concatenation
        System.out.println(name + " and " + friend);

        // ------------------- STRING METHODS -------------------

        // charAt(index) - get character at specific index
        String name1 = "Jay Shree Ram";
        System.out.println("Character at index 0: " + name1.charAt(0));  // Output: 'J'

        // replace(oldChar, newChar) - replaces characters
        String name2 = "Aryan";
        String name3 = name2.replace('A', 'r');  // Replaces 'A' with 'r'
        System.out.println("Replaced name: " + name3);  // Output: rryan

        // substring(startIndex, endIndex) - extracts part of string
        String name4 = "Rama";
        System.out.println("Substring from index 0 to 3: " + name4.substring(0, 3)); // Output: "Ram"
    }
}
