public abstract class Shape {
    //instance var, constructor, concrete methods, abstract methods
    protected String color;

    public  Shape(String color) {
        this.color = color;
    }

    //abstract method
    public abstract double calculateArea();

    //concrete method
    public void displayInfo() {
        IO.println("Color: " + color);
        IO.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
//        return Math.PI * radius * radius;
        return Math.PI * Math.pow(radius, 2);
    }
}

class Trapezoid extends Shape {
    private double baseA;
    private double baseB;
    private double height;

    public Trapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((baseA + baseB) * height) / 2;
    }
}

class shapeDemo {
    void main () {
//        Shape shape = new Circle("red", 3);
//        Circle circle = new Circle("blue", 4);
//        shape.calculateArea();
//        shape.displayInfo();

        Shape t = new Trapezoid("red", 2, 4, 3);
        Shape c = new Circle("blue", 5);
        Shape[] shapes = {t, c, new Circle("green", 10)};
        for (Shape s : shapes) {
            s.displayInfo();
        }
    }
}
