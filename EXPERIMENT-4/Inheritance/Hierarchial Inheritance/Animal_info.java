class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

public class Animal_info  {
    public static void main(String[] args) {
        // Mammal object
        Mammal dog = new Mammal();
        System.out.println("Dog:");
        dog.eat();
        dog.sleep();
        dog.walk();

        System.out.println();

        // Bird object
        Bird sparrow = new Bird();
        System.out.println("Sparrow:");
        sparrow.eat();
        sparrow.sleep();
        sparrow.fly();
    }
}
