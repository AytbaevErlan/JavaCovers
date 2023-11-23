package lecture7.Intro;

public interface  Salary {

    void salaryToPay(double hours, double rate);

    void salaryForOvertime(double hours);

    static void shouldReceiveBonus(int yearsOfExperience) {
        if(yearsOfExperience > 1)
        {
            System.out.println("employee should receive bonus!" );
        }
        else{
            System.out.println("no bonus!");
        }
    }
}
