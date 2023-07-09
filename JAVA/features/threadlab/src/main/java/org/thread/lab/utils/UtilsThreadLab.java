package org.thread.lab.utils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class UtilsThreadLab {

	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS");

	public static String getCurrentTime(){
		return dateFormat.format(System.currentTimeMillis());
	}

	public static Date getCurrentTimestamp(){
		return Calendar.getInstance().getTime();
	}

	public static Long getDiffDate(Date start, Date end){
		return Duration.ofSeconds(Math.abs(end.getTime() - start.getTime())).getSeconds();
	}


}
