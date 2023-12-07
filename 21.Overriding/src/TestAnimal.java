
public class TestAnimal {
	public static void main(String[] args) {
		System.out.println("Test dog: ");
		Dog d = new Dog("Dog");
		d.an();
		d.makeSound();
		d.sleep();
		System.out.println();
		
		System.out.println("Test cat: ");
		Cat c = new Cat("Cat");
		c.an();
		c.makeSound();
		c.sleep();
		System.out.println();
		
		System.out.println("Test bird: ");
		Bird b = new Bird("Bird");
		b.an();
		b.makeSound();
		b.sleep();
	}
}
