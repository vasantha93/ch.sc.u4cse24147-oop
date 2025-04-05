interface FoodDelivery {
    void deliverOrder(String foodItem);
}
class Zomato implements FoodDelivery {
    public void deliverOrder(String foodItem) {
        System.out.println("Zomato is delivering " + foodItem);
    }
}
class Swiggy implements FoodDelivery {
    public void deliverOrder(String foodItem) {
        System.out.println("Swiggy is delivering " + foodItem);
    }
}

public class Food {
    public static void main(String[] args) {
        FoodDelivery f1 = new Zomato();
        FoodDelivery f2 = new Swiggy();

        f1.deliverOrder("Pizza");
        f2.deliverOrder("Burger");
    }
}
