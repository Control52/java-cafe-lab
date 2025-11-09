package Cafe;
import Employees.Waiter;

public class Table {

    int number;
    boolean isOccupied;
    Waiter waiter;

    public void assignWaiter(Waiter waiter) {
        this.waiter = waiter;

    }

    void setOccupied(boolean is_occupied) {
        this.isOccupied = is_occupied;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;

    }
}
