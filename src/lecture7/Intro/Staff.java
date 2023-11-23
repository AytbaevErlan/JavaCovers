package lecture7.Intro;

import java.io.IOException;
import java.util.Scanner;

public class Staff extends Person implements Salary {
    String education;
    String position;

//    public void Staff() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("");
//    }

    void intialize1() throws IOException {
        personAdd();

        Scanner sc = new Scanner(System.in);
        System.out.println("Education: ");
        education = sc.nextLine();

        System.out.println("Position: ");
        position = sc.nextLine();
    }

    void print1(){
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    @Override
    public void salaryToPay(double hours, double rate) {
        double salary = hours * rate;
        System.out.println("Salary to pay: " + salary);
    }

    @Override
    public void salaryForOvertime(double hours) {
        if (hours > 160){
            System.out.println("Overtime salary - paid!/should receive! ");
        }
        else {
            System.out.println("No overtime shifts!");
        }
    }

}
