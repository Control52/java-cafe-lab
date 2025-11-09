package Employees;

import java.util.ArrayList;
import java.util.List;

import Cafe.Dish;
import Cafe.Order;
import Cafe.Table;

public class Waiter extends Employee {
    List<Order> comletedOrders = new ArrayList<>();

    public Waiter(String name, double baseSalary, int workingHours) {
        super(name, baseSalary, workingHours);
    }

    @Override
    public double calculateSalary() {
        double totalOrderValue = 0.0;
        for(Order order : comletedOrders){
            totalOrderValue += order.getTotalPrice();
        }
        return (baseSalary * workingHours) + (0.05 * totalOrderValue);
    }

    public Order takeOrder(Table table, List<Dish> chosenDishes) {
        table.assignWaiter(this);
        Order newOrder = new Order(table, this, chosenDishes, 0.0);
        return newOrder;
    }

    public void completeOrder(Order order){
        if(order.getWaiter() == this){
            comletedOrders.add(order);
        }
    }

    public List<Order> getCompletedOrders(){
        return comletedOrders;
    }

}
