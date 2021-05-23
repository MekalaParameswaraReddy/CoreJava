import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class Datetest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String ds = "2021/03/30";
		Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(ds);  
	    System.out.println(ds+"\t"+date1); 
	    
	   SimpleDateFormat sdfr = new SimpleDateFormat("yyyy/MM/dd");
	   String s = sdfr.format(date1);
	   System.out.println(s);
	   
	   Calendar myCal = Calendar.getInstance();
	   myCal.set(Calendar.YEAR, date1.getYear());
	   myCal.set(Calendar.MONTH, date1.getMonth());
	   myCal.set(Calendar.DAY_OF_MONTH, date1.getDay());
	   Date theDate = myCal.getTime();
	   System.out.println(theDate);
	   
	   
	}

}
