//23524202064 -> Punam

import java.util.Scanner;

public class MaximumExample {
    public static void main(String[] args) {
        int[] mark = {1, 2, 3, 4, 5, 6};
        int max = findmax(mark);
        System.out.println("The maximum value is: " + max);
    }

    public static int findmax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) { 
                max = i;
            }
        }
        return max;
    }
}