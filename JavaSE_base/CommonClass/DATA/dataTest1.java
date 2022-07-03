package CommonClass.DATA;

import java.util.Date;

public class dataTest1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());//格林尼治时间，废弃方法
        System.out.println(d.toLocaleString());//当地时间
        System.out.println(d.getYear());//这个日期代表的年份，减去1900年。
        System.out.println(d.getMonth());//该日期的代表月份（0~11之间）。
        System.out.println(d.getTime());//返回自1970年1月1日以来，由此 Date对象表示的00:00:00 GMT的毫秒数 。
        System.out.println(System.currentTimeMillis());//自1970年1月1日以来，返回当前时间（以毫秒为单位）。
        //getTime()和currentTimeMillis()相比一般常用currentTimeMillis()，因为后者为静态可以直接参数调用不需要对象。
        //使用currentTimeMillis()计算算法的时间
        long startTime=System.currentTimeMillis();
        for (int i=0;i<200;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        long endTime=System.currentTimeMillis();
        System.out.println("输出共用时："+(endTime-startTime));
    }
}
