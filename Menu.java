import java.util.List;
import java.util.ArrayList;

public class Menu {

    List<Dish> dishes = new ArrayList<>();

    public Menu() {
        dishes.add(DishCreator.createPastaWithSausages());
        dishes.add(DishCreator.createRiceWithSaira());
        dishes.add(DishCreator.createСhickenInOwner());
    }

    public List<Dish> getDishes() {
        return dishes;
    }
    
}
