package com.admazing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String,Date>
{
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private static final ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DATE_FORMAT);
        }
    };

    public  Date unmarshal(String value) {
        if (value == null){
            return null;
        }
        SimpleDateFormat sf = dateFormatter.get();
        try {
            return sf.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public  String marshal(final Date value) {
        if (value == null) {
            return null;
        }
        SimpleDateFormat sf = dateFormatter.get();
        return sf.format(value);
    }


}