public class Table {

    int number;
    boolean isOccupied;
    Waiter waiter;

    void assignWaiter(Waiter waiter) {
        this.waiter = waiter;

    }

    void setOccupied(boolean is_occupied) {
        this.isOccupied = is_occupied;
    }
}
