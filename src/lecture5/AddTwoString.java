package lecture5;

public class AddTwoString {
    public static void main(String[] args) {
        String stringOne = "Hello";
        String stringTwo = " World";
        String stringThree = stringOne.concat("").concat(stringTwo.concat(""));

        System.out.println(stringThree);
    }
}
