package cn.itheima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String dateToStr(Date date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return dateFormat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Date strToDate(String date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
