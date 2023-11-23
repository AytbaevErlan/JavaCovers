package lecture7.AnimalsClass;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove{
    public Pigeon(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Pigeon's sound");
    }



    @Override
    void eat() {
        super.eat();
        System.out.println("Pigeon eat Worm");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }

    @Override
    public void move(Object ob) {
        AnimalMove.super.move(ob);
    }
}
