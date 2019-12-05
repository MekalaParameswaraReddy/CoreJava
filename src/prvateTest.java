import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class prvateTest {
	String n;
	prvateTest(String s){
		n = s;
	}
	
	public void test() throws UnknownHostException{
		 String name= "paa";
	/*	System.out.println(name);
	String name1 ="ra";
	String name2 ="ra";
	System.out.println("print" + name1.equals("ra"));
	InetAddress obj = InetAddress.getByName("google.com");
	InetAddress obj2 = InetAddress.getByName("google.com");
	boolean x = obj.equals(obj2);
	System.out.println(x);*/
		 /*Pattern p = Pattern.compile(".s");
		 Matcher m = p.matcher("as");
		 boolean b = m.matches();
		 boolean b2 = Pattern.compile(".s").matcher("as").matches();
		 boolean b3 = Pattern.matches(".s", "as");
		 System.out.println(b+""+b2+""+b3);*/
		 int sum =0;
		 for(int i=0, j=0; i<6& j<6;++i,j=i+1){
			 sum +=i;
			 System.out.println(sum);
		 }
	
	}
	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		prvateTest one = new prvateTest("Try");
		one.test();
		/*prvateTest one = new prvateTest("Try");
		prvateTest two = new prvateTest("Fly");
		System.out.println((one==two));
		prvateTest the = new prvateTest("Try");
		two = one;
		
		System.out.println((one==two));
		System.out.println((one==the));*/
	}

}
