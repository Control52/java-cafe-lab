package Cafe;
import Employees.Waiter;

public class Table {
    private int number;
    private boolean isOccupied;
    private Waiter waiter;

    public void assignWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Waiter getWaiter() {
        return waiter;
    }
}
