package Cafe;
import java.util.List;
import java.util.ArrayList;

public class Menu {

    List<Dish> dishes = new ArrayList<>();

    public Menu() {
        dishes.add(DishCreator.createPastaWithSausages());
        dishes.add(DishCreator.createRiceWithSaira());
        dishes.add(DishCreator.createChickenInOwner());
    }

    void addDish(Dish dish) {
        dishes.add(dish);
    }

    void removeDish(String title) {
        for (int i = 0; i < dishes.size(); i++) {
            Dish d = dishes.get(i);
            if (d != null && title.equalsIgnoreCase(d.title)) {
                dishes.remove(i);
            }
        }

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
            if (dish.title.equals(title)) {
                return dish;
            }
        }
        return null;
    }

    // метод для вывода меню

    void showMenu() {
        for (Dish dish : dishes) {
            System.out.println(dish.title);
        }
        System.out.println();
    }

}
