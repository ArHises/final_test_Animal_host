package Methods.Animals;

import java.time.LocalDateTime;
import java.util.List;

import Methods.Animal;
import Methods.Commands;

public abstract class DomesticAnimal extends Animal {

    public DomesticAnimal(String dateOfBirth, String name, List<Commands> commands) {
        super(dateOfBirth, name, commands);
    }

}