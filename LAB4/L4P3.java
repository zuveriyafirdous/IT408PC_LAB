import java.util.Scanner;
//import java.io.IOException;
class L4P3 extends Exception{
	public static void getValue(int x){
		if(x%2!=0)
			throw new ArithmeticException  ("Odd Number");
		else
			System.out.println(x);
	}
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			getValue(a);
		}catch(ArithmeticException ame){
			System.out.println(ame.getMessage());
		}
		finally{
			System.out.println("Exception handled");
		}
	}
}
