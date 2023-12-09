package Methods;

import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {

    private Map<Integer, Animal> registry;

    public AnimalRegistry() {
        this.registry = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        if (!registry.containsKey(animal.getId())) {
            registry.put(animal.getId(), animal);
            System.out.println("New Animal Added!");
        } else {
            System.err.println("ID is already in use!");
        }
    }
}
