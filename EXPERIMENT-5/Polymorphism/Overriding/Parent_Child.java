class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the child class method.");
    }
}

public class Parent_Child {
    public static void main(String[] args) {
        Parent obj = new Child();    
     obj.show(); 
    }
}
