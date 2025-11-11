import Cafe.Cafe;
import Cafe.Client;
import Cafe.Dish;
import Cafe.Menu;
import Cafe.Order;
import Cafe.Table;
import Cafe.Product;
import Employees.Chef;
import Employees.Waiter;

class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.openCafe();

        Menu menu = new Menu();

        Table table = new Table();
        table.setNumber(2);

        Waiter waiter = new Waiter("Никита", 15.0, 40);

        Client client = new Client(1000, Client.AgeType.ADULT);
        client.sitAtTable(table);

        Order order = waiter.takeOrder(table, client);

        Dish chosen = menu.getDishByName("Макароны c сосисками");
        if (chosen != null) {
            order.addDish(chosen);
        }

        System.out.println("Количество выбранных блюд: " + order.getChosenDishes().size());
        for (Dish d : order.getChosenDishes()) {
            System.out.println(" - " + d.getTitle() + " : цена = " + d.getPrice());
            System.out.print("   Состав: ");
            for (Product p : d.getProducts()) {
                System.out.print(p.getProductName() + " ");
            }
            System.out.println();
        }

        System.out.println("Заказ создан. Статус: " + order.getStatusRu());

        Chef chef = new Chef("Алексей", 20.0, 40, 5);
        chef.prepareOrder(order);

        System.out.println(
                "Итоговый статус заказа: " + order.getStatusRu() + ", итоговая сумма: " + order.getTotalPrice());

        waiter.completeOrder(order);
        System.out.println("Зарплата официанта: " + waiter.calculateSalary());
        System.out.println("Зарплата повара: " + chef.calculateSalary());

        System.out.println("Цена блюда со скидкой 10%: " + chosen.getDiscountedPrice(0.1));

        cafe.closeCafe();
    }

}
