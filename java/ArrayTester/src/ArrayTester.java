/**
 * Created by Adarsh on 12/1/2015.
 */

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class ArrayTester {

    public static void main(String[] args) {
        int[] arr = {1,3,71,4,98,-5};
        for(int i : arr){
        System.out.print("\t" + i);
        }

        System.out.print("\n");
        sort(arr);

        for(int i : arr){
            System.out.print("\t" + i);
        }

        int found = binarySearch(arr,71);
        System.out.println("\nGotcha, found at:  "+found+" the value: "+arr[found]);
        System.out.print("heylo");

    }

}
