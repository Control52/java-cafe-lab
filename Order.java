import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Dish> orderDishes = new ArrayList<>();
    OrderStatus status;
    int clientId;

    public enum OrderStatus {
        NEW,
        PROCESSING,
        DONE
    }

    public Order (OrderStatus status, int clientId) {
        this.status = status;
        this.clientId = clientId;
    }

    
}
