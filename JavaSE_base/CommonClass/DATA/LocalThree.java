package CommonClass.DATA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalThree {
    public static void main(String[] args) {
        //now()获取当前日期
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDate);//2021-05-06
        System.out.println(localTime);//14:36:42.096
        System.out.println(localDateTime);//2021-05-06T14:36:42.096
        System.out.println("-------------------------------------------------");
        //of()设定指定的日期和时间
        LocalDate localDate1=LocalDate.of(1998,12,12);
        LocalTime localTime1=LocalTime.of(13,45,33);
        LocalDateTime localDateTime1=LocalDateTime.of(1987,8,19,23,14,57);
        System.out.println(localDate1);//1998-12-12
        System.out.println(localTime1);//13:45:33
        System.out.println(localDateTime1);//1987-08-19T23:14:57
        System.out.println("-------------------------------------------------");
        //get方法
        System.out.println(localDateTime.getYear());//2021
        System.out.println(localDateTime.getMonth());//MAY
        System.out.println(localDateTime.getMonthValue());//5
        System.out.println(localDateTime.getDayOfYear());//126
        System.out.println(localDateTime.getDayOfMonth());//6
        System.out.println(localDateTime.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime.getHour());//14
        System.out.println(localDateTime.getMinute());//26
        System.out.println(localDateTime.getSecond());//26
        System.out.println("-------------------------------------------------");
        //with方法，相当于Calendar里的set方法，但set会改变原日期，with只改变新的日期。(不可不变性)
        LocalDateTime localDateTime2=localDateTime.withDayOfMonth(12);
        System.out.println(localDateTime);//2021-05-06T14:29:29.297
        System.out.println(localDateTime2);//2021-12-06T14:29:29.297
        System.out.println("-------------------------------------------------");
        //加减操作
        LocalDateTime localDateTime3=localDateTime.plusMonths(4);
        LocalDateTime localDateTime4=localDateTime.minusMonths(7);
        System.out.println(localDateTime3);//2021-09-06T14:36:42.096
        System.out.println(localDateTime4);//2020-10-06T14:36:42.096
    }
}
