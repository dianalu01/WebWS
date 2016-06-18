package com.admazing.core.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Time;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;

public class TimeAdapter 
{
    private static final String TIME_FORMAT = "HH:mm:ss";

    private static final ThreadLocal<SimpleDateFormat> timeFormatter = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(TIME_FORMAT);
        }
    };

    public static Time unmarshal(String value) {
        if (value == null){
            return null;
        }
        SimpleDateFormat sf = timeFormatter.get();
        try {
        	
        	sf.format(DatatypeConverter.parseDate(value));
            return(Time) sf.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String marshal(final Time value) {
        if (value == null) {
            return null;
        }
        Calendar cal = new GregorianCalendar();
        cal.setTime(value);
        
        SimpleDateFormat sf = timeFormatter.get();
        return sf.format(DatatypeConverter.printDate(cal));
    }


}