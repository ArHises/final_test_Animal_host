package Methods.Animals;

import java.time.LocalDateTime;
import java.util.List;

import Methods.Commands;

public class Cat extends DomesticAnimal {

    public Cat(String dateOfBirth, String name, List<Commands> commands) {
        super(dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}
