import java.util.Arrays;
import java.util.Collections;
public class Collectionclass {
    public static void main(String[] args){

        // sorting of array as well char
        int[] number = {9,8,7,6,5,4,3,2,1,10};
        char[] name = {'a', 'b','d', 'c', 'f', 's'};
        Arrays.sort(number);
        Arrays.sort(name);

        // System.out.print("Sorted chars: ");
        for (int i=0; i< name.length; i++){
            System.out.print(name[i]+ " ");
        }

        System.out.println();
        // System.out.print("Sorted numbers: ");
        for (int j=0; j<number.length; j++ ){
            System.out.print(number[j] + " ");
        }

        System.out.println();

        // binary search that element is stored in it or not 
        int[] element = {1,2,3,4,5,6,7};
        int result = Arrays.binarySearch(element ,4);
        System.out.println("The index 4 element is: " + result);
        




    }
}
