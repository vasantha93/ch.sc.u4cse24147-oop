class Animal {
    String breed;

    public void animalInfo(String breed) {
        System.out.println("The breed of the dog is " + breed);
    }
}

class Mammal extends Animal {
    int id;

    public void mammalInfo(int id) {
        System.out.println("The ID of the dog is " + id);
    }
}

class Dog extends Mammal {
    String address;

    public void dogInfo(String address) {
        System.out.println("Address of the dog is " + address);
    }
}

public class Animal_Information {
    public static void main(String[] args) {
        System.out.println("------ The Dog Details Are -------");

        Dog d = new Dog();
        d.animalInfo("Labrador");
        d.mammalInfo(123);
        d.dogInfo("Guntur");
    }
}
