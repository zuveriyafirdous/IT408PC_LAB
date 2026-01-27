import java.util.*;
class L2P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		outerwhile:
		while(i<=n){
			for(int j=1;j<=10;j++){
				System.out.println(i+"x"+j+"="+i*j);
				if(j>=10){
					System.out.println("If you want to continue 1 else 0");
					switch(sc.nextInt()){
					case 0:
						break outerwhile;
					case 1:
						continue;
					}
				}
			}
			i++;
		}
	}
}
