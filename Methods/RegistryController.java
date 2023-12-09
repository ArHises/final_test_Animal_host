package Methods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class RegistryController {

    private static int animalCounter = 0;
    private Map<Integer, Animal> registry;

    public RegistryController() {
        this.registry = new HashMap<>();
    }

    public Map<Integer, Animal> GetAnimals() {
        return registry;
    }

    public void addAnimal(Animal animal) {
        registry.put(this.animalCounter, animal);
        this.animalCounter++;
        System.out.println("New Animal Added!");
    }

    public List<Commands> GetCommandList(int id) {
        return this.registry.get(id).getCommands();
    }

    public void TrainCommand(int id, Commands command) {
        this.registry.get(id).AddCommands(command);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(); // Initialize StringBuilder
        for (Map.Entry<Integer, Animal> entry : registry.entrySet()) {
            result.append("ID: ").append(entry.getKey())
                    .append(", Animal: ").append(entry.getValue().toString())
                    .append("\n");
        }
        return result.toString();
    }

}
