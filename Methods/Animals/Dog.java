package Methods.Animals;

import java.time.LocalDateTime;
import java.util.List;

import Methods.Commands;

public class Dog extends DomesticAnimal {

    public Dog(String dateOfBirth, String name, List<Commands> commands) {
        super(dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
