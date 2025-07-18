public class Restaurant {
    private String name;
    private Meal[] menu;

    public Restaurant(String name, Meal[] menu) {
        this.name = name;
        this.menu = menu;
    }

    public void showMenu() {
        System.out.println(name + " Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }
}
