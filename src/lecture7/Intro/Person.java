package lecture7.Intro;

import java.io.IOException;
import java.util.Scanner;

public class Person {
    String surname;
    String firstName;
    String street;
    String zipcode;
    String city;

    public void personAdd() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Surname: ");
        surname = sc.nextLine();;

        System.out.println("First Name: ");
        firstName = sc.nextLine();

        System.out.println("street: ");
        street = sc.nextLine();

        System.out.println("zipcode: ");
        zipcode = sc.nextLine();

        System.out.println("city: ");
        city = sc.nextLine();
    }

    void print(){
        System.out.println("Surname: " + surname);
        System.out.println("firstName: " + firstName);
        System.out.println("street: " + street);
        System.out.println("zipcode: " + zipcode);
        System.out.println("city: " + city);
    }
}
