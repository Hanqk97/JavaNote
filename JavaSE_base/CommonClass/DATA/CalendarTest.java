package CommonClass.DATA;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal=new GregorianCalendar();
        Calendar cal2= Calendar.getInstance();
        System.out.println(cal);
        //get方法
        System.out.println("get方法");
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(cal.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数

        //set方法
        cal.set(Calendar.YEAR,1997);
        cal.set(Calendar.MONTH,1);
        cal.set(Calendar.DATE,17);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));

    }
}
