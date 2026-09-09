import java.util.Scanner;

class Animal {
    public void makeSound(){
		System.out.println("Animal makes a sound");
	}
}

// Subclass Dog that overrides makeSound
class Dog extends Animal {
    public void makeSound(){
		System.out.println("Dog barks");
	}
}

// Subclass Cat that overrides makeSound
class Cat extends Animal {
    public void makeSound(){
		System.out.println("Cat meows");
	}
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String animalType = scanner.nextLine();
        
        Animal animal = null;
        
        if (animalType.equalsIgnoreCase("Dog")) {
            animal= new Dog();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            animal=new Cat();
        } else {
            System.out.println("invalid animal");
         scanner.close();
           return; 
            
        }
        
        animal.makeSound();
        
        scanner.close();
    }
}