package Cafe;
import java.util.ArrayList;
import java.util.List;

import Employees.Waiter;

public class Order {

    private List<Dish> chosenDishes = new ArrayList<>();
    private OrderStatus status;
    private Table table;
    private Waiter waiter;
    private double totalPrice;

    public enum OrderStatus {
        NEW,
        PROCESSING,
        DONE,
        SERVED
    }

    public Order(Table table, Waiter waiter, List<Dish> chosenDishes) {

        this.table = table;
        this.waiter = waiter;

        if (chosenDishes != null) {
            this.chosenDishes = new ArrayList<>(chosenDishes);
        } else {
            this.chosenDishes = new ArrayList<>();
        }

        
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
    
    public Waiter getWaiter() {
        return waiter;
    }
    
    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
}
