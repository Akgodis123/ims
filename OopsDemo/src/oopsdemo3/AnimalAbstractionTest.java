package oopsdemo3;

abstract class Animal{
	public void eat() {
		System.out.println("I can eat");
	}
    abstract void makesound() ;

}

class Dog extends Animal {

	@Override
	void makesound() {
		System.out.println("Bark ");
		
	}
	
}

public class AnimalAbstractionTest {

	public static void main(String[] args) {
		Animal a=new Dog();
		
		a.eat();
		a.makesound();

	}

}
