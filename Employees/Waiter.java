package Employees;

import java.util.ArrayList;
import java.util.List;

import Cafe.Order;
import Cafe.Table;
import Cafe.Client;

public class Waiter extends Employee {
    private List<Order> completedOrders = new ArrayList<>();

    public Waiter(String name, double baseSalary, int workingHours) {
        super(name, baseSalary, workingHours);
    }

    @Override
    public double calculateSalary() {
        double totalOrderValue = 0.0;
        for(Order order : completedOrders){
            totalOrderValue += order.getTotalPrice();
        }
        return (getBaseSalary() * getWorkingHours()) + (0.05 * totalOrderValue);
    }

    public Order takeOrder(Table table, Client client) {
        table.assignWaiter(this);
        Order newOrder = new Order(table, client);
        return newOrder;
    }

    public void completeOrder(Order order){
        if(order.getTable().getWaiter() == this){
            completedOrders.add(order);
        }
    }

    public List<Order> getCompletedOrders(){
        return completedOrders;
    }

}
