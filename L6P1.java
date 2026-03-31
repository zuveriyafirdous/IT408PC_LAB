import java.util.ArrayDeque;
import java.util.*;
class L6P1{
	public static void main(String...args){
		ArrayDeque<String> ad = new ArrayDeque<>();
		System.out.println(ad.isEmpty());
		ad.add("Black");
		ad.add("white");
		ad.add("pink");
		ad.add("brown");
		ad.add("Orange");
		List<String> l=new LinkedList<>(ad);
		System.out.println(l);
		l.remove(3);
		ad.clear();
		ad.addAll(l);
		System.out.println(l);
		Collections.sort(l);
		ad.clear();
		ad.addAll(l);
		Iterator<String> it = ad.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println("\n" + ad.peek());
		ad.clear();
		System.out.println(ad.isEmpty());
	}
}