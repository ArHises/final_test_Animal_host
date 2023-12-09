package Methods;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Abstract class Animal
public abstract class Animal {
    private String dateOfBirth;
    private String name;
    private List<Commands> commands;

    public Animal(String dateOfBirth, String name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.commands = new ArrayList<Commands>();
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Commands> getCommands() {
        return commands;
    }

    public void AddCommands(Commands command) {
        this.commands.add(command);
    }

    @Override
    public String toString() {
        String listOfCommands = "No Commands";
        if (commands != null)
            listOfCommands = commands.toString();
        return "{ "
                + "Name: " + this.name + " ,"
                + "B-Day: " + this.dateOfBirth + " ,"
                + "Commands: " + listOfCommands
                + " }";
    }
}
