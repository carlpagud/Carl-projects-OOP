package Interface;

public interface Shape {
    //constants, abstract methods, default methods

//    public abstract double calculateArea(); pwede din to
    double calculateArea();

    //default method - with method body
    default void displayInfo() {
        IO.println("Area: " + calculateArea());
    }
}
interface Resizable {
    void resize (double factor);

    default void doubleSize() {
        resize(2);
    }

    default void halfSize() {
        resize(0.5);
    }
}

class Circle implements Shape, Resizable {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo() {
        IO.println("Radius: " + radius);
        IO.println("Circle Area: " + calculateArea());
    }

    @Override
    public void resize (double factor) {
        this.radius *= factor;
    }
}

class Trapezoid implements Shape {
    private double baseA;
    private double baseB;
    private double height;

    public  Trapezoid (double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((baseA + baseB) * height) / 2;
    }
}

class ShapeDemo {
    void main () {
//        Shape s = new Shape();
        Shape s = new Circle(5);
        
//        s.calculateArea();
//        s.displayInfo();
//        Circle c = new Circle(5);
//        c.resize(2.5);
//        c.displayInfo();
//
//        Shape t = new Trapezoid(2, 5, 3);
//        t.displayInfo();
    }
}
