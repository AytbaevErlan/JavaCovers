package lecture7.Intro;

import java.io.IOException;

import static lecture7.Intro.Salary.shouldReceiveBonus;

public class Main {
    public static void main(String[] args) throws IOException {
//        Person person = new Person();
//        person.personAdd();
//        person.print();
        Staff staff = new Staff();
        staff.intialize1();
        staff.print1();
        staff.salaryForOvertime(168);
        staff.salaryToPay(168, 23.01);
        shouldReceiveBonus(5);
    }
}
