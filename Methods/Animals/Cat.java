package Methods.Animals;

public class Cat extends DomesticAnimal {

    public Cat(String dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}
