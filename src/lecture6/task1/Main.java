package lecture6.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] arr = {1, 5, 8,34, 234, 2,3, 345, 345, 234, 654, 456 , 456, 3 , 3, 2, 3, 1};
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        counter++;
                    }
                    counter++;
                }
                counter++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("counter: " + counter);


    }
}
