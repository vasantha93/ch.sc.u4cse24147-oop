class Printertest {
    void printData(int num) {
        System.out.println("Integer: " + num);
    }

    void printData(double num) {
        System.out.println("Double: " + num);
    }

    void printData(String text) {
        System.out.println("String: " + text);
    }
}

public class printer {
    public static void main(String[] args) {
        Printertest obj = new Printertest();

        obj.printData(10);
        obj.printData(12.5);
        obj.printData("Hello World!");
    }
}
