package Methods.Animals;

import java.time.LocalDateTime;
import Methods.Commands;

public class Hamster extends DomesticAnimal {

    public Hamster(int id, int number, LocalDateTime dateOfBirth, String name, Commands commands) {
        super(id, number, dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Pipipi");
    }

}
