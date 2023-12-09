package Methods;

import java.time.LocalDateTime;

// Abstract class Animal
public abstract class Animal {
    private int id;
    private int number;
    private LocalDateTime dateOfBirth;
    private String name;
    private Commands commands;

    public Animal(int id, int number, LocalDateTime dateOfBirth, String name, Commands commands) {
        this.id = id;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.commands = commands;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commands getCommands() {
        return commands;
    }

    public void setCommands(Commands commands) {
        this.commands = commands;
    }
}
