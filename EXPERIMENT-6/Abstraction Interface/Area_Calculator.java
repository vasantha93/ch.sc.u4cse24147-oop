interface Shape {
    double area();
}

abstract class AbstractShape implements Shape {
    double dimension;

    AbstractShape(double dimension) {
        this.dimension = dimension;
    }

    abstract void display();
}

class Circle extends AbstractShape {
    Circle(double radius) {
        super(radius);
    }

    public double area() {
        return Math.PI * dimension * dimension;
    }

    void display() {
        System.out.println("Circle with radius: " + dimension);
    }
}

public class Area_Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display(); 
        System.out.println("Area: " + c.area());
    }
}
