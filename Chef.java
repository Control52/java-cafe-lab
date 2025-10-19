
public class Chef {

    String name;

    void prepareOrder(Order order) {

        order.status = Order.OrderStatus.PROCESSING;

        System.out.println("Chef " + name + " started preparing order for table "
                + (order.table != null ? order.table.number : "unknown"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        order.status = Order.OrderStatus.DONE;
        System.out.println("Chef " + name + " finished preparing order");

    }

}
