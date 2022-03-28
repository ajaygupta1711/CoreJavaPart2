import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
		System.out.println(sdf.format(d));

		SimpleDateFormat sd = new SimpleDateFormat("M/d/y hh:mm:ss");
		System.out.println(sd.format(d));
	}

}
