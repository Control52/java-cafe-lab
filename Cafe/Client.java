package Cafe;

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

    public void sitAtTable(Table table) {
        this.table = table;
        if (this.table != null) {
            this.table.setOccupied(true);
        }

    }

    public List<Dish> getChosenDishes() {
        return chosenDishes;

    }

}
