import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Dish> chosenDishes = new ArrayList<>();
    OrderStatus status;
    Table table;
    Waiter waiter;
    double totalPrice;

    public enum OrderStatus {
        NEW,
        PROCESSING,
        DONE,
        SERVED
    }

    public Order(Table table, Waiter waiter, List<Dish> chosenDishes, double totalPrice) {

        this.table = table;
        this.waiter = waiter;

        // безопасно присваиваем список (копия)
        if (chosenDishes != null) {
            this.chosenDishes = new ArrayList<>(chosenDishes);
        } else {
            this.chosenDishes = new ArrayList<>();
        }

        // вычисляем итоговую цену и сохраняем в поле
        this.totalPrice = calculateTotalPrice(this.chosenDishes);
        this.status = OrderStatus.NEW;
    }

    double calculateTotalPrice(List<Dish> chosenDishes) {
        double sum = 0.0;
        if (chosenDishes == null) return sum;
        for (Dish dish : chosenDishes) {
            if (dish != null) {
                sum += dish.price;
            }
        }
        return sum;
    }

}
