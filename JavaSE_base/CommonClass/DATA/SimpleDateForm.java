package CommonClass.DATA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateForm {
    public static void main(String[] args) throws ParseException {
//        //String==>java.sql.Date
//        java.sql.Date date=java.sql.Date.valueOf("2021-5-21");
//        //java.sql.Date==>java.util.Date
//        java.util.Date date2=date;
//        System.out.println(date2.toString());
        DateFormat date=new  SimpleDateFormat("yyyy,MM,dd HH:mm:ss");
        //String==>Date
        Date s=date.parse("2020,03,03 09:29:34");
        System.out.println(s);
        //Date==>String
        String s2= date.format(new Date());
        System.out.println(s2);
    }
}
