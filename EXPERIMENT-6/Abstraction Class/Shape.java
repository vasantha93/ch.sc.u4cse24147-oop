abstract class main {
    abstract void draw();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends main {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Shape {
    public static void main(String[] args) {
        main myshape = new Circle();
        myshape.display();
        myshape.draw();
    }
}
