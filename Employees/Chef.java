package Employees;
import Cafe.Order;
import Cafe.Order.OrderStatus;

public class Chef extends Employee {
    private int overtimeHours;
    private static final double OVERTIME_RATE = 1.5;


    public Chef(String name, double baseSalary, int workingHours, int overtimeHours){
        super(name, baseSalary, workingHours);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary(){
        return (baseSalary * workingHours) + (overtimeHours * OVERTIME_RATE * baseSalary);
    }

    public void prepareOrder(Order order) {
        order.setStatus(OrderStatus.PROCESSING);

        System.out.println("Повар " + name + " начал готовить заказ для стола "
            + (order.getTable() != null ? order.getTable() : "неизвестно"));

    try {
    Thread.sleep(4000);
    } catch (InterruptedException ignored) {
    }

    order.setStatus(OrderStatus.DONE);
    System.out.println("Повар " + name + " закончил готовить заказ");

    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

}
