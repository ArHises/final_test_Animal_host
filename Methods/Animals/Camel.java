package Methods.Animals;

import java.time.LocalDateTime;
import java.util.List;

import Methods.Commands;

public class Camel extends BaggegeAnimals {

    public Camel(String dateOfBirth, String name, List<Commands> commands) {
        super(dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Hhh-Tuee!");
    }

}
