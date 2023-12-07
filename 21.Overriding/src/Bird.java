
public class Bird extends Animal{
	public Bird(String name) {
		super("Bird");
	
}

	@Override
	public void an() {
		super.an();
		System.out.println("An sau");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Chip chip");
	}
}