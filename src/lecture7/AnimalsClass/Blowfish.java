package lecture7.AnimalsClass;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove{
    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Fishes have no voice");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Fish eat worm too.");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping");
    }

    @Override
    public void move(Object ob) {
        AnimalMove.super.move(ob);
    }
}
