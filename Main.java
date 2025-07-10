class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + "is eating.");
    }
}
 // child class
 class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    void bark() {
        System.out.println(name + "is barking.");
    }
    void displayInfo() {
        System.out.println("Name : "+ name);
        System.out.println("Breed : " + breed);
    }
 }
 //main class
 public class Main {
    public static void main(String[]args) {
        Dog dog1 = new Dog("Tommy", "Labrador");
    
 
 dog1.eat();
 dog1.bark();
 dog1.displayInfo();
}
}