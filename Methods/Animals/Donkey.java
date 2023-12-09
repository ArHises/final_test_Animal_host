package Methods.Animals;

public class Donkey extends BaggegeAnimals {

    public Donkey(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Eee-Aahhh");
    }

}
