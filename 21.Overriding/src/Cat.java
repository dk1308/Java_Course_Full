
public class Cat extends Animal{
	public Cat(String name) {
		super("Cat");
	
}

	@Override
	public void an() {
		super.an();
		System.out.println("An ca");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Meo meo");
	}
}