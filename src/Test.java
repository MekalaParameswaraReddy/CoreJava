import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		//System.out.println("HelloWorld" + i);
		int a=8;
		int b=9;
		int c=0;
		int d=4;
		int e=5;
		int f=5;
		int g=2;
		int h=3;
		int j=4;
		System.out.println(
		(a * 3) + (b * 7) + (c * 1) +
		(d * 3) + (e * 7) + (f * 1) +
		(g * 3) + (h * 7) + (j * 1));
		System.out.println(a+""+b+""+c+""+d+""+e+""+f+""+g+""+h+""+j);
		//http://www.brainjar.com/js/validation/
		//System.out.println("0320".compareTo("034"));
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("one1" );
		list.add("one11" );
		list.add("one111" );
		map.put("1", list);
		
		List<String> list2 = new ArrayList<String>();
		System.out.println("initia size == "+ list2.size());
		list2.add("one2" );
		System.out.println("initia add size == "+ list2.size());
		list2.add("one22" );
		list2.add("one222" );
		map.put("2", list2);
		//System.out.println(map);
		Double num=5.5;
		num.doubleValue()
		;
		String s="ba'";
				if(s.contains("'")){
					s = s.replace("'", "''");
				}
				System.out.println(s);
				
				Long l1 = null;
				String a1 = String.valueOf(l1.longValue());
				if(a1!=null){
					System.out.println("o");
				}
	}
}
