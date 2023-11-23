package lecture5;
//Please write a program that creates a 10-element array and puts the
//numbers from 9 to 0 in it.
//Please use two loops:
//- "classic" for loop to fill the array, but in the condition please use the
//.length method,
//- for-each as a second loop to display the value of the array.
public class FillingAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }


}
