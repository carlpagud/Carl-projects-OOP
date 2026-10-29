public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void displayInfo() {
        IO.println(name);
    }

    public void makeSound() {
        IO.println("hello");
    }
}

class Bird extends Animal {

}

class Dog extends Animal {

    @Override
    public void makeSound() {
        IO.println("arf arf");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        IO.println("meow meow");
    }
}

class AnimalDemo {
    void main() {
        Animal animal = new Animal();
//        animal.makeSound();
        Dog  dog = new Dog();
//        dog.makeSound();
        Animal brownie = new Dog();
//        brownie.makeSound();
        Animal kuting = new Cat();
//        kuting.makeSound();

        Animal[] animals  = new Animal[]{animal, dog, brownie, kuting, new Cat()};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
