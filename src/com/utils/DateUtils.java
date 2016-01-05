package com.utils;



import java.util.Date;

import org.joda.time.DateTime;

/**
 *
 * @Message:  created by Liujishuai on 2016年1月5日
 * 
 * @Description: 时间处理工具类
 */
public class DateUtils {

	/**
	 * 获取当前时间时间戳
	 */
	public static Long getCurrentUnixTimeStamp(){
		return new DateTime().getMillis()/1000;
	}
	/**
	 * 获取指定时间的时间戳
	 */
	public static Long  getUnixTimeStamp(Date date){
		return new DateTime(date).getMillis()/1000;
	}
	/**
	 * 获取本月1号零点时间戳
	 */
	public static Long getCurrentMonthZeroTimeStamp(){
		DateTime dateTime=new DateTime();
		dateTime=dateTime.withDayOfMonth(1).withTimeAtStartOfDay();
		return dateTime.getMillis()/1000;
	}
	/**
	 * 获取本月最后一天24点，也就是下个月零点时间戳
	 */
	public static Long getNextMonthZeroStamp(){
		DateTime dateTime=new DateTime();
		dateTime=dateTime.plusMonths(1).withDayOfMonth(1).withTimeAtStartOfDay();
		return dateTime.getMillis()/1000;
	}
}
