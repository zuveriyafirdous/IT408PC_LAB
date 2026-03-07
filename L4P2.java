import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class L4P2{
	public static void main(String...args) throws IOException{
		//Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader sc=new BufferedReader(isr);
		try{
			int x=Integer.parseInt(sc.readLine());
			int y=Integer.parseInt(sc.readLine());
			System.out.println(x/y);
		}//catch(InputMismatchException ime){
			//System.out.println(ime.getMessage());
		//}
		catch(ArithmeticException ame){
			System.out.println(ame.getMessage());
		}//catch(Exception e){
			//System.out.println(e.getMessage());
		//}
		//finally{
			//System.out.println("Exception Handled");
		//}
	}
}