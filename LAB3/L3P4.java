 abstract class Animal{
	abstract void makeSound();
}
class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Meow");
	}
}
public class L3P4{
	public static void main(String...args){
		Cat c=new Cat();
		c.makeSound();
	}
}
