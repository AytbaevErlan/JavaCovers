package lecture5;

import java.util.Arrays;




public class RandomNumbers {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");

        }
        Arrays.sort(arr);
        System.out.println("min " + arr[0] + " | max " + arr[arr.length - 1]);
        // arr[i] = rd.nextInt(); // storing random integers in an array
        //            System.out.println(arr[i]); // printing each array element
    }
}