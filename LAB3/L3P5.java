abstract class Animal{
	abstract void sound();
}
class Lion extends Animal{
	@Override
	public void sound(){
		System.out.println("Roar");
	}
}
class Tiger extends Animal{
	@Override
	public void sound(){
		System.out.println("shout");
	}
}
public class L3P5{
	public static void main(String...args){
		Tiger t=new Tiger();
		t.sound();
		Lion l=new Lion();
		l.sound();
	}
}
