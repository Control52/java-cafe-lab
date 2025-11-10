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
        return (getBaseSalary() * getWorkingHours()) + (overtimeHours * OVERTIME_RATE * getBaseSalary());
    }

    public void prepareOrder(Order order) {
        order.setStatus(OrderStatus.PROCESSING);

        String tableInfo = "неизвестно";
        if (order.getTable() != null) {
            tableInfo = String.valueOf(order.getTable().getNumber());
        }
        System.out.println("Повар " + getName() + " начал готовить заказ для стола " + tableInfo);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {
        }

        order.setStatus(OrderStatus.DONE);
        System.out.println("Повар " + getName() + " закончил готовить заказ");
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

}
