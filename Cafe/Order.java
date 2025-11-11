package Cafe;
import java.util.ArrayList;
import java.util.List;


public class Order {

    private List<Dish> chosenDishes = new ArrayList<>();
    private OrderStatus status;
    private Table table;
    private double totalPrice;
    private Client client;
 

    public enum OrderStatus {
        NEW,
        PROCESSING,
        DONE,
        SERVED
    }

    public Order(Table table, Client client) {

        this.table = table;
        this.client = client;
        this.chosenDishes = new ArrayList<>();
        this.totalPrice = calculateTotalPrice(this.chosenDishes);
        this.status = OrderStatus.NEW;
    }

    double calculateTotalPrice(List<Dish> chosenDishes) {
        double sum = 0.0;
        if (chosenDishes == null) return sum;
        for (Dish dish : chosenDishes) {
            if (dish != null) {
                sum += dish.getPrice();
            }
        }
        return sum;
    }

    public String getStatusRu() {
        switch (status) {
            case NEW:
                return "Новый";
            case PROCESSING:
                return "В обработке";
            case DONE:
                return "Готов";
            case SERVED:
                return "Подается";
            default:
                return "Неизвестно";
        }
    }

    public void addDish(Dish dish) {
        if (dish != null) {
            chosenDishes.add(dish);
            totalPrice = calculateTotalPrice(chosenDishes);
        }
    }

     public List<Dish> getChosenDishes() {
        return new ArrayList<>(chosenDishes);
    }
    
    public OrderStatus getStatus() {
        return status;
    }
    
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public Table getTable() {
        return table;
    }
    
    public void setTable(Table table) {
        this.table = table;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }

}
