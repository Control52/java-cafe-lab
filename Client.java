import java.util.List;

public class Client {
    int money;
    AgeType type;
    int id;

    enum AgeType {
        ADULT,
        CHILDREN
    }

    public Client (int money, AgeType type, int id) {
        this.money = money;
        this.type = type;
        this.id = id;
    }

    public Order placeOrder(List<Dish> chosenDishes) {

        Order order = new Order(Order.OrderStatus.NEW, this.id);

        order.orderDishes.addAll(chosenDishes);

        return order;

    }


}
