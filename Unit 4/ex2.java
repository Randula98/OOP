interface Animal{
	void eat();
	void makeSound();
}

class Dog implements Animal{

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
	
}

class Cat implements Animal
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
}class ex2 {
    
}
