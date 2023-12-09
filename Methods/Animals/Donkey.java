package Methods.Animals;

import java.time.LocalDateTime;

import Methods.Commands;

public class Donkey extends BaggegeAnimals {

    public Donkey(int id, int number, LocalDateTime dateOfBirth, String name, Commands commands) {
        super(id, number, dateOfBirth, name, commands);
    }

    @Override
    public void makeSound() {
        System.out.println("Eee-Aahhh");
    }

}
