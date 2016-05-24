package com.admazing;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimeAdapter extends XmlAdapter<String,Time>
{
    //private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	private static final String TIME_FORMAT = "HH:mm:ss";
    private static final ThreadLocal<SimpleDateFormat> timeFormatter = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(TIME_FORMAT);
        }
    };

    public  Time unmarshal(String value) {
        if (value == null){
            return null;
        }
        SimpleDateFormat sf = timeFormatter.get();
        try {
            return (Time) sf.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public  String marshal(final Time value) {
        if (value == null) {
            return null;
        }
        SimpleDateFormat sf = timeFormatter.get();
        return sf.format(value);
    }
}