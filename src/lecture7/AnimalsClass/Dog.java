package lecture7.AnimalsClass;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Dogs Bark");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Dogs eat bones.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move(Object ob) {
        AnimalMove.super.move(ob);
    }
}
