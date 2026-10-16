package Mid;

class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("Weight: " + weight);
        IO.println("Animal sound");
    }
}

class Dog extends Animal {
    private String breed;
    private double foodPerDay;

    public Dog(String name, int age, double weight, String breed, double foodPerDay) {
        super(name, age, weight);
        this.breed = breed;
        this.foodPerDay = foodPerDay;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getFoodPerDay() {
        return foodPerDay;
    }

    public void setFoodPerDay(double foodPerDay) {
        this.foodPerDay = foodPerDay;
    }

    public double calculateWeeklyFood() {
        return foodPerDay * 7;
    }

@Override
public void displayInfo() {
    IO.println("Name: " + getName());
    IO.println("Age: " + getAge());
    IO.println("Weight: " + getWeight() );
    IO.println("Woff aww");
}
    public void displayDog() {
        IO.println("Dog's breed: " + breed);
        IO.println("Dog's food per day: " + foodPerDay);
        calculateWeeklyFood();
    }
}

class Cat extends Animal {
    private String color;
    private double foodPerDay;

    public Cat(String name, int age, double weight, String color, double foodPerDay) {
        super(name, age, weight);
        this.color = color;
        this.foodPerDay = foodPerDay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFoodPerDay() {
        return foodPerDay;
    }

    public void setFoodPerDay(double foodPerDay) {
        this.foodPerDay = foodPerDay;
    }

    public double calculateMonthlyFood() {
        return foodPerDay * 30;
    }

    public void displayCat() {
        IO.println("Cat's color: " + color);
        IO.println("Cat's food per day: " + foodPerDay);
        calculateMonthlyFood();
    }
}

public class Main {
    static void main() {
        Dog d = new Dog("Bantay", 3, 7.9, "Aspin", 12);
        Cat c = new Cat("Muning", 5, 2.5, "purple", 13);

        d.displayInfo();
        d.displayDog();

        System.out.println();

        c.displayCat();
        c.displayInfo();
    }
}
