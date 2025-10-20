import java.util.ArrayList;
import java.util.List;

public class Dish {
    // поля класса Dish
    String title;
    String description;
    double price;
    int weight;
    List<Product> products = new ArrayList<>();
    DishType type;
    int caloricContent;

    // Типы блюд
    public enum DishType {
        DRINK,
        SOUP,
        MAIN
    }

    // Конструктор класса Dish
    public Dish(String title, String description, double price,
            int weight, DishType type, int caloricContent) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.caloricContent = caloricContent;
    }
}