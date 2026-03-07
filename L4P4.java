import java.util.Scanner;
import java.io.File;
class L4P4{
	public static void main(String...args){
		File f=new File("ABC.java");
		readFile(f);
	}
	public static void readFile(File f){
		Scanner sc = new Scanner(f);
		while(sc.hasNext()){
			System.out.println("Proceeding");
		}
	}
}