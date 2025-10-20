public class Chef {

    String name;

    void prepareOrder(Order order) {

        order.status = Order.OrderStatus.PROCESSING;

        System.out.println("Повар " + name + " начал готовить заказ для стола "
                + (order.table != null ? order.table.number : "неизвестно"));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {
        }

        order.status = Order.OrderStatus.DONE;
        System.out.println("Повар " + name + " закончил готовить заказ");

    }

}
