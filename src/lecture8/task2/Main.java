package lecture8.task2;

public class Main {
    public static void main(String[] args) {
        TestCase();
        TestCase2();
    }


    private static void TestCase(){
         try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e){
             System.out.println("You cannot get this index of Array as it is out of bound");;
        }
         finally {
             System.out.println("end point");
         }
    };

    private static void TestCase2(){
        try {
            int a = 5;
            int b = 5 / 0;
            System.out.println(b);
        } catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }

        finally {
            System.out.println("end point");
        }
    };

}
