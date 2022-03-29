interface Animal{
	void eat();
	void makeSound();
}

interface Playing
{
	void play();
}

class Dog implements Animal , Playing
{
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat implements Animal, Playing
{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
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