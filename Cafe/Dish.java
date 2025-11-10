package Cafe;

import java.util.ArrayList;
import java.util.List;

public class Dish implements Discountable {
    // поля класса Dish
        private String title;
        private String description;
        private double price;
        private int weight;
        private List<Product> products = new ArrayList<>();
        private DishType type;
        private int caloricContent;

        public static final double DEFAULT_DISCOUNT_RATE = 0.1;

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

    @Override
    public double getDiscountedPrice(double discountRate) {
        return price * (1 - discountRate);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public DishType getType() {
        return type;
    }
    
        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public int getCaloricContent() {
            return caloricContent;
        }

        public void setCaloricContent(int caloricContent) {
            this.caloricContent = caloricContent;
        }
}