package lecture2;

public class Main {

    public static void main(String[] args) {

        float inEarth;
        float inMars;
        double kgInMars;
        double kgInMarsInFour;
        int castedToInt;


        inEarth = 83.0f;
        inMars = inEarth * 0.38f;
        kgInMars = inMars;
        kgInMarsInFour = kgInMars;
        castedToInt = (int) kgInMars;


        System.out.println(inEarth + " kg on Earth is " + inMars + " kg on Mars");
        System.out.println("Kg on Mars after converting to double " + kgInMars);
        System.out.print("Kg on Mars displayed to four decimal ");
        System.out.printf("%.4f", kgInMarsInFour);
        System.out.println();

        System.out.println("Kg on Mars when casted to int " + castedToInt);

        char table = (char) inMars;
        System.out.println("ASCII  table equivalent" + table);

        int math = table * 5;

        System.out.println("AN example of math operation: " + math);

    }

}
