package Cafe;
import java.util.List;
import java.util.ArrayList;

public class Menu {

    private List<Dish> dishes = new ArrayList<>();

    public Menu() {
        dishes.add(DishCreator.createPastaWithSausages());
        dishes.add(DishCreator.createRiceWithSaira());
        dishes.add(DishCreator.createChickenInOwner());
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(String title) {
        dishes.removeIf(d -> d != null && title.equalsIgnoreCase(d.getTitle()));
    }

    /*
     * метод поиска блюда по названию
     * на вход получает переменную "название" типа строка
     * запускается цикл for-each (Тип_элемента имя_переменной бери из (:) коллекция)
     * если название совпадает, возвращает объект типа Dish
     * иначе null
     */
    public Dish getDishByName(String title) {
        for (Dish dish : dishes) {
            if (dish.getTitle().equals(title)) {
                return dish;
            }
        }
        return null;
    }

    // метод для вывода меню

    public void showMenu() {
        for (Dish dish : dishes) {
            System.out.println(dish.getTitle());
        }
        System.out.println();
    }

    public List<Dish> getDishes() {
        return new ArrayList<>(dishes);
    }
}
