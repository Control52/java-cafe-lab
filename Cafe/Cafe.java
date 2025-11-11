package Cafe;
public class Cafe {
	private boolean open;

	public Cafe() {
		this.open = false;
	}

	public void openCafe() {
		open = true;
		System.out.println("Кафе открыто!");
	}

	public void closeCafe() {
		open = false;
		System.out.println("Кафе закрыто!");
	}

	public boolean isOpen() {
		return open;
	}
}
