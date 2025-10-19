class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Table table = new Table();
        table.number = 1;

        Waiter waiter = new Waiter();
        waiter.name = "Ivan";

        Client client = new Client();
        client.sitAtTable(table);

        Dish chosen = menu.getDishByName("Макароны c сосисками");
        if (chosen != null) {
            client.getChosenDishes().add(chosen);
        }

        System.out.println("Client chosen dishes: " + client.getChosenDishes().size());
        for (Dish d : client.getChosenDishes()) {
            System.out.println(" - " + d.title + " : price=" + d.price);
        }

        Order order = waiter.takeOrder(table, client.getChosenDishes());
        System.out.println("Order created. Status: " + order.status + ", total: " + order.totalPrice);


        Chef chef = new Chef();
        chef.name = "Petr";
        chef.prepareOrder(order);


        System.out.println("Final order status: " + order.status + ", total: " + order.totalPrice);
    }
}
