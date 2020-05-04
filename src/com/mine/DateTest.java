package com.mine;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(LocalDate.now().isLeapYear());
		
		dt = dt.plusDays(1);
		System.out.println("Starting....."+dt);
		
		dt = dt.minusDays(1);
		System.out.println(dt);
		
		//https://www.java2novice.com/java-8/date-time-api/string-to-date-object/
		 // if date is ISO_LOCAL_DATE format it is very straight conversion
        // means string date is in "yyyy-mm-dd" format
        String dateStr = "2015-11-18";
        LocalDate dtObj = LocalDate.parse(dateStr);
        System.out.println("Date object: "+dtObj);
 
        // convert it using formatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fdtObj = LocalDate.parse("18/11/2015", dateFormatter);
        System.out.println("Date object: "+fdtObj);
 
        // convert 18 Nov 2015
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate fdtObj1 = LocalDate.parse("18 Nov 2015", dateFormatter1);
        System.out.println("Date object: "+fdtObj1);
        
        // current time in timestamp format
        Instant currTimeStamp = Instant.now();
        System.out.println("current timestamp: "+currTimeStamp);
 
        // get current time in milli seconds
        System.out.println("current time in milli seconds: "+currTimeStamp.toEpochMilli());
 
        // get current time in unix time
        System.out.println("current time in unix time: "+currTimeStamp.getEpochSecond());
 
        //parsing date from ISO 8601
        Instant strToDate = Instant.parse("2015-11-01T12:00:00Z");
        System.out.println("string to date conversion: "+strToDate);
        
        // get current date
        LocalDate currTime = LocalDate.now();
        System.out.println("current date: "+currTime);
 
        // add 10 days to the current date time
        LocalDate dateAfter10Days = currTime.plus(Period.ofDays(10));
        System.out.println("date after 10 days: "+dateAfter10Days);
 
        // what is the date a week before
        LocalDate dateBeforeWeek = currTime.minus(Period.ofWeeks(3));
        System.out.println("date before 3 week: "+dateBeforeWeek);
 
        // no of days between two dates
        Period periofDiff = Period.between(dateBeforeWeek, dateAfter10Days);
        System.out.println("day difference: "+periofDiff.getDays());
        System.out.println("months difference: "+periofDiff.getMonths());
        
     // create custom date objects
     		LocalDate dtObj1 = LocalDate.of(2015, 12, 15);
             LocalDate dtObj2 = LocalDate.of(2016, 01, 15);

             System.out.println("First date: "+dtObj1);
             System.out.println("Second date: "+dtObj2);

             boolean result = dtObj1.isAfter(dtObj2);
             System.out.println("is first date after second date?: "+result);

             result = dtObj2.isAfter(dtObj1);
             System.out.println("is second date after first date?: "+result);

             result = dtObj1.isBefore(dtObj2);
             System.out.println("is first date before second date?: "+result);

             // you can use equals  method on date objects
             result = dtObj1.isEqual(dtObj2);
             System.out.println("is first date equals to second date?: "+result);

             // compare two dates with comareTo method
             if(dtObj1.compareTo(dtObj2) > 0) {
             		System.out.println("first date is after second date");
             } else if(dtObj1.compareTo(dtObj2) < 0) {
             		System.out.println("first date is before second date");
             } else if(dtObj1.compareTo(dtObj2) == 0) {
             		System.out.println("first date is equals to second date");
             }
     	

	}
}
