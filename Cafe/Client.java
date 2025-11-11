package Cafe;

import java.util.ArrayList;
import java.util.List;

public class Client {
   
    private int money;
    private AgeType type;
    private Table table;
    private List<Dish> chosenDishes = new ArrayList<>();

    public enum AgeType {
        ADULT,
        CHILDREN
    }

    public Client(int money, AgeType type) {
        this.money = money;
        this.type = type;
        this.table = null;
    }

    public void sitAtTable(Table table) {
        this.table = table;
        if (this.table != null) {
            this.table.setOccupied(true);
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public AgeType getType() {
        return type;
    }

    public void setType(AgeType type) {
        this.type = type;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public List<Dish> getChosenDishes() {
        return chosenDishes;
    }

    public void setChosenDishes(List<Dish> chosenDishes) {
        this.chosenDishes = chosenDishes;
    }
}
