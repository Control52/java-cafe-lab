import java.util.ArrayList;
import java.util.List;

public class Client {
    int money;
    AgeType type;
    Table table;
    List<Dish> chosenDishes = new ArrayList<>();

    enum AgeType {
        ADULT,
        CHILDREN
    }


    void sitAtTable(Table table) {
        this.table = table;
        if (this.table != null) {
            this.table.setOccupied(true);
        }
    
    }

    List <Dish> getChosenDishes(){
         return chosenDishes;

    }





}
