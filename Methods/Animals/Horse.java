package Methods.Animals;

import java.time.LocalDateTime;
import java.util.List;

import Methods.Commands;

public class Horse extends BaggegeAnimals {

    public Horse(String dateOfBirth, String name, List<Commands> commands) {
        super(dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Eeehhh!");
    }

}
