package CommonClass.PackClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class IntegerTest {
    public static void main(String[] args) {
        System.out.println("属性");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //“物极必反”
        System.out.println("--------------------------------------");
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println("--------------------------------------");
        System.out.println("构造器");
        Integer integer =new Integer(12);
        System.out.println(integer);
        Integer integer1=new Integer("13");
        System.out.println(integer1);
    }
}
