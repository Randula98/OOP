abstract class Animal{
	public void eat()
	{
		System.out.println("I am eating");
	}
	
	abstract void makeSound();
}

class Dog extends Animal{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof");
		
	}
	
}

class Cat extends Animal
{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
	}
	
}

class Main{
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.eat();
		cat.makeSound();
	}
}