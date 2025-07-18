public class Main {
    public static void main(String[] args) {
        Meal[] menu = {
                new Meal("Kebab", 80),
                new Meal("Lahmacun", 25),
                new Meal("Ayran", 10)
        };

        Restaurant restaurant = new Restaurant("ChatRestaurant", menu);
        restaurant.showMenu();
    }
}


