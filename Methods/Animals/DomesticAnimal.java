package Methods.Animals;

import java.time.LocalDateTime;

import Methods.Animal;
import Methods.Commands;

public abstract class DomesticAnimal extends Animal {

    public DomesticAnimal(int id, int number, LocalDateTime dateOfBirth, String name, Commands commands) {
        super(id, number, dateOfBirth, name, commands);
    }

}