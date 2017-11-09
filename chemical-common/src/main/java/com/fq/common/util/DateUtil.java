package com.fq.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fq.common.constant.RetCode;
import com.fq.exception.JnwtvException;

public class DateUtil {

	private static final DateFormat FORMAT_YYYYMMDD = new SimpleDateFormat("yyyy-MM-dd") ;
	
	/**
	 * 获取昨天的Date
	 * @return
	 */
	public final static Date getLastDay(){
		return DateUtil.getLastDay(new Date()) ;
	}
	
	/**
	 * 获取上一日Date
	 * @param date
	 * @return
	 */
	public final static Date getLastDay(Date date){
		Calendar c = Calendar.getInstance() ;
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, -1) ;
		return c.getTime() ;
	}
	
	/**
	 * 校验时间字符串是否符合时间格式化对象定义的格式
	 * 注：dateFormat的lenient属性决定了检查是否是宽松的
	 * @param date
	 * @param dateFormat
	 * @throws JnwtvException
	 */
	public final static void checkDateString( String date , DateFormat dateFormat ) throws JnwtvException{
		try {
			dateFormat.parse(date);
		} catch (ParseException e) {
			throw new JnwtvException(RetCode.WRONG_DATE_FORMAT) ;
		} 
	}

	/**
	 * 获取范围内的每一天
	 * @param begin
	 * @param end
	 * @return
	 * @throws ParseException 
	 */
	public final static List<Date> getEveryDayInRange( Date begin , Date end ) throws ParseException{
		
		List<Date> dates = new ArrayList<Date>() ;
		
		Calendar tempCalendar = Calendar.getInstance() ;
		tempCalendar.setTime(FORMAT_YYYYMMDD.parse(FORMAT_YYYYMMDD.format(begin)));
		
		Date endDate = FORMAT_YYYYMMDD.parse(FORMAT_YYYYMMDD.format(end)) ;
		
		while(true){
			if( tempCalendar.getTime().after(endDate) ){
				break ;
			}
			dates.add(tempCalendar.getTime()) ;
			tempCalendar.add( Calendar.DAY_OF_YEAR, 1 );
		}
		
		return dates ;
		
	}

//	public static void main(String[] args) throws ParseException {
//		
//		Calendar beginCalendar = Calendar.getInstance() ;
//		beginCalendar.setTime(new Date());
//		beginCalendar.add(Calendar.DAY_OF_YEAR, -15);
//		Date begin = beginCalendar.getTime() ;
//		List<Date> dates = getEveryDayInRange(begin,new Date());
//		
//		for( Date date : dates ){
//			System.out.println(date);
//		}
//	}
	
}
