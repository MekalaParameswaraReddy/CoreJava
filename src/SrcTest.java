import java.util.logging.Logger;


public class SrcTest {
	private  final Logger LOGGER = Logger.getLogger(SrcTest.class.getName());
	public void test() {
		try{
			LOGGER.info("please enter name: " + LOGGER.getName());
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.printStackTrace());
		}
		
	}
	public static void main(String[] args) {
		/*String name = "paramesh";
		System.out.println(name);*/
		SrcTest srcTest = new SrcTest();
		srcTest.test();
	}
}
