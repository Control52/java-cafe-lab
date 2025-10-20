import java.util.List;

public class Waiter {

    String name;

    Order takeOrder(Table table, List<Dish> chosenDishes) {

        table.assignWaiter(this);

        Order newOrder = new Order(table, this, chosenDishes, 0.0);
        return newOrder;
    }

}
