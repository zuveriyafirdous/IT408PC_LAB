import java.util.*;
class L6P2{
	public static void main(String...args){
		PriorityQueue<String> pq=new PriorityQueue<>();
		System.out.println(pq.isEmpty());
		pq.add("Black");
		pq.add("White");
		pq.add("Orange");
		pq.add("Pink");
		pq.add("Red");
		System.out.println(pq);
		Iterator<String> it = pq.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		for(int i=0;i<4;i++){
			System.out.print(pq.poll());
		}
		pq.clear();
		System.out.println("\n"+pq.isEmpty());
	}
}
