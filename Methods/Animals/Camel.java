package Methods.Animals;

public class Camel extends BaggegeAnimals {

    public Camel(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hhh-Tuee!");
    }

}
