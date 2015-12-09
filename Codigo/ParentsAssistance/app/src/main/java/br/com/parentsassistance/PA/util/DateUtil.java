package br.com.parentsassistance.PA.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Robinson on 09/12/2015.
 */
public class DateUtil {

    public static Date getDate(int year, int monthOfYear, int dayOfMonth){

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monthOfYear, dayOfMonth);
        Date data = calendar.getTime();
        return data;
    }

    public static String dateToString(int year, int monthOfYear, int dayOfMonth){

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monthOfYear, dayOfMonth);
        Date data = calendar.getTime();

        //Formatar a Data de para String
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
        String dt = format.format(data);

        return dt;
    }

    public static String dateToString(Date date){

        //Formatar a Data de para String
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
        String dt = format.format(date);

        return dt;
    }
}

