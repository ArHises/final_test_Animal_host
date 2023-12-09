package Methods;

import java.time.LocalDateTime;
import java.util.Scanner;

import Methods.Animals.Camel;
import Methods.Animals.Cat;
import Methods.Animals.Dog;
import Methods.Animals.Donkey;
import Methods.Animals.Hamster;
import Methods.Animals.Horse;

public class AnimalRegistry {

    private RegistryController reController;

    public AnimalRegistry() {
        this.reController = new RegistryController();
    }

    public void Run() {
        int input;
        boolean flag = true;
        while (flag) {
            displayMenu();
            input = intInput();
            switch (input) {
                case 1:
                    viewAnimals();
                    break;
                case 2:
                    addAnimal();
                    break;
                case 3:
                    teachCommand();
                    break;
                case 0:
                    System.out.println("Exiting the menu. Goodbye!");
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    private int intInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
            }

        }
        return input;
    }

    private void viewAnimals() {
        System.out.println(reController.toString());
    }

    private void addAnimal() {
        System.out.println("Enter Animal Type:");
        System.out.println("1.Dog");
        System.out.println("2.Cat");
        System.out.println("3.Hamster");
        System.out.println("4.Horse");
        System.out.println("5.Camel");
        System.out.println("6.Donkey");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        String animalName;
        switch (input) {
            case 1:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Dog(LocalDateTime.now().toString(), animalName, null));
                break;
            case 2:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Cat(LocalDateTime.now().toString(), animalName, null));
                break;
            case 3:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Hamster(LocalDateTime.now().toString(), animalName, null));
                break;
            case 4:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Horse(LocalDateTime.now().toString(), animalName, null));
                break;
            case 5:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Camel(LocalDateTime.now().toString(), animalName, null));
                break;
            case 6:
                System.out.println("Enter Name: ");
                animalName = scanner.nextLine();
                reController.addAnimal(new Donkey(LocalDateTime.now().toString(), animalName, null));
                break;
            default:
                System.out.println("Error! Enter Animal Type:");
        }
    }

    private void teachCommand() {
        System.out.println("Enter Animal ID:");
        Scanner scanner = new Scanner(System.in);
        while (!reController.GetAnimals().isEmpty()) {
            int input = scanner.nextInt();
            scanner.nextLine();
            if (reController.GetAnimals().containsKey(input)) {
                System.out.println("Enter one of the commands:");
                System.out.println("SIT, STAY, ROLL_OVER, FETCH");
                String comm = scanner.nextLine();
                try {
                    reController.TrainCommand(input, Commands.valueOf(comm));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input for enum: " + comm);
                }
                break;
            } else {
                System.out.println("Error!");
                System.out.println("Enter Animal ID:");
            }
        }
    }

    private void displayMenu() {
        System.out.println("===== Animal Registry Menu =====");
        System.out.println("1. View Animals");
        System.out.println("2. Add Animal");
        System.out.println("3. Teach new Command");
        System.out.println("0. Exit");
        System.out.println("===============================");
    }
}