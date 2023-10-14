package lecture2;

public class CheckForEven {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        System.out.println("Random number: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " Is even ");
        } else {
            System.out.println("Is odd");
        }
    }
}
