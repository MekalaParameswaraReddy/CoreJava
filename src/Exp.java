
/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class Exp {
	public void test() {
		try {
			int a =10/0;
		}catch(Exception e){
			//System.exit(0);
		}finally{
			System.out.println("hello final");	
		}
		System.out.println("hello");
	}
public static void main(String[] args) {
	Exp exp = new Exp();
	exp.test();
}
}
