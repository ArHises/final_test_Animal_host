package Methods.Animals;

public class Dog extends DomesticAnimal {

    public Dog(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
