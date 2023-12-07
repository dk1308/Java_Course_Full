
public class Dog extends Animal{

	public Dog(String name) {
		super("Dog");
	}
	@Override
	public void an() {
		super.an();
		System.out.println("An xuong");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Gau gau");
	}
}
