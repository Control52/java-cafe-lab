package Cafe;

public class DishCreator {
    private static final double PASTA_PRICE = 345;
    private static final int PASTA_WEIGHT = 1000;
    private static final int PASTA_CALORIES = 20000;

    private static final double RICE_PRICE = 300;
    private static final int RICE_WEIGHT = 2000;
    private static final int RICE_CALORIES = 100000;

    private static final double CHICKEN_PRICE = 777;
    private static final int CHICKEN_WEIGHT = 2010;
    private static final int CHICKEN_CALORIES = 1000;

    public static Dish createRiceWithSaira() {
    Dish dish = new Dish("Рис c сайрой", "Авторское блюдо от Алексея Крыгина",
        RICE_PRICE, RICE_WEIGHT, Dish.DishType.MAIN, RICE_CALORIES);
    dish.addProduct(new Product("Рис"));
    dish.addProduct(new Product("Сайра"));
    dish.addProduct(new Product("Соль"));
    return dish;
    }

    public static Dish createPastaWithSausages() {
    Dish dish = new Dish("Макароны c сосисками", "Авторское блюдо от Никиты Загибалова",
        PASTA_PRICE, PASTA_WEIGHT, Dish.DishType.MAIN, PASTA_CALORIES);
    dish.addProduct(new Product("Макароны"));
    dish.addProduct(new Product("Сосиски"));
    dish.addProduct(new Product("Соль"));
    return dish;
    }

    public static Dish createChickenInOwner() {
    Dish dish = new Dish("Куринная грудка в духовке", "Авторское блюдо от Анатолия Шаповалова",
        CHICKEN_PRICE, CHICKEN_WEIGHT, Dish.DishType.MAIN, CHICKEN_CALORIES);
    dish.addProduct(new Product("Куринная грудка"));
    dish.addProduct(new Product("Специи"));
    dish.addProduct(new Product("Масло"));
    return dish;
    }

    public static Dish createChicken() {
    Dish dish = new Dish("Курица", "Авторское блюдо от Анатолия Шаповалова",
        CHICKEN_PRICE, CHICKEN_WEIGHT, Dish.DishType.MAIN, CHICKEN_CALORIES);
    dish.addProduct(new Product("Курица"));
    dish.addProduct(new Product("Соль"));
    dish.addProduct(new Product("Масло"));
    return dish;
    }
}
