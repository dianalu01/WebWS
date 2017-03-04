package com.admazing.core.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;

public class DateAdapter 
{
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private static final ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DATE_FORMAT);
        }
    };

    public static Date unmarshal(String value) {
        if (value == null){
            return null;
        }
        SimpleDateFormat sf = dateFormatter.get();
        try {
        	
        	sf.format(DatatypeConverter.parseDate(value));
            return sf.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String marshal(final Date value) {
        if (value == null) {
            return null;
        }
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(value);
        
        return DatatypeConverter.printDate(cal);       
        
    }

}