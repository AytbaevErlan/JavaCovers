package lecture7.AnimalsClass;


public class Zoo {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Bird("Pigeon", 5, 5.00);
        animal[1] = new Mammal("Dog", 5, 5.00);
        animal[2] = new Fish("Blowfish",5,5.00);
        Dog dog = new Dog("Dog", 5, 5);
        dog.move("");


//        Dog dog = new Dog();
//        Pigeon pigeon = new Pigeon();
//        Blowfish blowfish = new Blowfish();
//        dog.voice();
//        dog.eat();
//        pigeon.voice();
//        pigeon.eat();
//        blowfish.voice();
//        blowfish.eat();
    }
}
