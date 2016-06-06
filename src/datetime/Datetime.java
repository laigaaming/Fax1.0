package datetime;

import java.text.*;
import java.util.Date;

public class Datetime {
	public String getTime() {
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		String time=format.format(date);
		return time;
	}
	public String getDateTime() {
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date);
		return time;
	}
	
	public String getDate() {
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMdd");
		String dt=format.format(date);
		return dt;
	}
}
