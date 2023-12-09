package Methods.Animals;

public class Horse extends BaggegeAnimals {

    public Horse(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Eeehhh!");
    }

}
