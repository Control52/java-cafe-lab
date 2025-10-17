import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        Client client1 = new Client(10000, Client.AgeType.ADULT, 1);

        Menu menu = new Menu();

        List<Dish> choosenDishes = new ArrayList<>();

        choosenDishes.add(menu.getDishes().get(0));

        Order order = client1.placeOrder(choosenDishes);

        System.out.println("Статус закаказа:" + order.status);
        System.out.println("Клиент заказал:");
        for (Dish dish : order.orderDishes) {
            System.out.println("🍽️ " + dish.title);
        }

    }
}