/**
 * Created by Adarsh on 11/3/2015.
 */

import java.util.*;


public class Quicksort {
    static int[] arr;
    static Random rnd = new Random();

    static void swap(int a, int b) {
        int temp = arr[a]; arr[a] = arr[b]; arr[b] = temp;
    }

    static int partition(int start, int end) {
        int pivot = start;
        boolean flag = false;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] < arr[start] || (arr[i] == arr[start] && (flag = !flag))) swap(++pivot, i);
        }
        swap(start, pivot);
        return pivot;
    }

    static void quicksort(int start, int end) {
        if (start >= end - 1) return;
        swap(start, start + rnd.nextInt(end - start));
        int pivot = partition(start, end);
        quicksort(start, pivot);
        quicksort(pivot + 1, end);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

       /*
        int n = 10;
        int[] arr1 = {2,6,3,5,8,4,9,1,0,7};
        arr = arr1;
        */

        quicksort(0, n);

        for (int i = 0; i < n; i++) System.out.print(arr[i]);
    }
}
