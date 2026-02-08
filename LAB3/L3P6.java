abstract class Animal{
	abstract void sound();

}
abstract class Lion extends Animal{
	abstract void behave();
}
class Tiger extends Lion{
	public void behave(){
		System.out.println("Wild");
	}
	public void sound(){
		System.out.println("Tiger Sound");
	}
}
public class L3P6{
	public static void main(String...args){
		Tiger t=new Tiger();
		t.behave();
		t.sound();
	}
}
