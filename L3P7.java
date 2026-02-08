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
	public static void main(string...args){
		System.out.println("Tiger class");
	}
}
