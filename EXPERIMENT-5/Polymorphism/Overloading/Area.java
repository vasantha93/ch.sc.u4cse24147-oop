class AreaCalculator {
    double calculate(double side) {
        return side * side;
    }

       double calculate(double length, double width) {
        return length * width;
    }

       double calculate(double length, double width, double height) {
        return length * width * height;
    }
}

public class Area {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        
        System.out.println("Area of Square: " + obj.calculate(5));
        System.out.println("Area of Rectangle: " + obj.calculate(5, 6));
        System.out.println("Volume of Box: " + obj.calculate(5, 3, 4));
    }
}
