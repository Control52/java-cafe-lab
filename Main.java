class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Table table = new Table();
        table.number = 1;

        Waiter waiter = new Waiter();
        waiter.name = "Никита";

        Client client = new Client();
        client.sitAtTable(table);

        Dish chosen = menu.getDishByName("Макароны c сосисками");
        if (chosen != null) {
            client.getChosenDishes().add(chosen);
        }

        System.out.println("Количество выбранных блюд: " + client.getChosenDishes().size());
        for (Dish d : client.getChosenDishes()) {
            System.out.println(" - " + d.title + " : цена=" + d.price);
        }

        Order order = waiter.takeOrder(table, client.getChosenDishes());
        System.out.println("Заказ создан. Статус: " + order.status + ", итоговая сумма: " + order.totalPrice);

        Chef chef = new Chef();
        chef.name = "Алексей";
        chef.prepareOrder(order);

        System.out.println("Итоговый статус заказа: " + order.status + ", итоговая сумма: " + order.totalPrice);
    }

}
