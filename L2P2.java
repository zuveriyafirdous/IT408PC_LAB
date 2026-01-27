import java.util.*;
class L2P2{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int c2=0;
		for(int z:arr){
			int  c=0;
			for(int j=1;j<=z;j++){
				if(z%j==0){
					c++;
				}
			}
			if(c==2){
				System.out.println(z);
				c2++;
			}
		}
	}
}