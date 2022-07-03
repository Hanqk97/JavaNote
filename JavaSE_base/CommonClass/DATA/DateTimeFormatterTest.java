package CommonClass.DATA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
     //方式一：预定义的标准格式。ISO_DATE_TIME,ISO_DATE,ISO_TIME。
     DateTimeFormatter df1=  DateTimeFormatter.ISO_DATE_TIME;
     //LocalDateTime==>String
        LocalDateTime now= LocalDateTime.now();
        String str=df1.format(now);
        System.out.println(str);//2021-05-06T15:03:28.75
     //String==>LocalDateTime
        TemporalAccessor parse=df1.parse("2021-05-06T15:03:28.75");
        System.out.println(parse);//{},ISO resolved to 2021-05-06T15:03:28.750

     //方式二：本地化相关格式：ofLocalizedDateTime(),ofLocalizedDateTime(),ofLocalizedDate(),ofLocalizedTime()
        //参考：FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT
        DateTimeFormatter df2=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter df3=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter df4=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
     //LocalDateTime==>String
        LocalDateTime now1= LocalDateTime.now();
        String str1=df2.format(now1);
        String str2=df3.format(now1);
        String str3=df4.format(now1);
        System.out.println(str1);//2021年5月6日 下午03时18分38秒
        System.out.println(str2);//2021-5-6 15:18:38
        System.out.println(str3);//21-5-6 下午3:18
     //String==>LocalDateTime
        TemporalAccessor parse1=df2.parse("2021年5月6日 下午03时18分38秒");
        System.out.println(parse1);//{},ISO resolved to 2021-05-06T15:18:38

     //方式三：自定义的格式：ofPa
        DateTimeFormatter df5=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
     //LocalDateTime==>String
        LocalDateTime now2=LocalDateTime.now();
        String str4=df5.format(now2);
        System.out.println(str4);//2021-05-06 03:29:54
     //String==>LocalDateTime
        TemporalAccessor parse2=df5.parse("2021-05-06 03:29:54");
        System.out.println(parse2);//{SecondOfMinute=54, NanoOfSecond=0, MinuteOfHour=29, MicroOfSecond=0, HourOfAmPm=3, MilliOfSecond=0},ISO resolved to 2021-05-06
    }
}
