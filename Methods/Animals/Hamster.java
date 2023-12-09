package Methods.Animals;

public class Hamster extends DomesticAnimal {

    public Hamster(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Pipipi");
    }

}
