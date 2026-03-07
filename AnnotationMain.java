import java.lang.reflect.Method;
import java.lang.annotation.*;

class AnnotationMain{
	@Bullet(str="Camlin", dbl=12.36658)
	public static void anyMethod(){
		try{
				Method mtd = AnnotationMain.class.getMethod("anyMethod");
				Bullet b=mtd.getAnnotation(Bullet.class);
				System.out.println("String..."+b.str());
				System.out.println("Double..."+b.dbl());
			}catch(Exception e){
				System.out.println("ABCD>...");
				System.out.println(e.getMessage());
			}
	}
	public static void main(String...args){
		try{
			anyMethod();
		}catch(Exception e){

		}		
	}
}