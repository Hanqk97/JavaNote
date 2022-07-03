package CommonClass.String;

import java.util.Arrays;
import java.util.Locale;

public class BasicString {
    public static void main(String[] args) {
        String s1 =new String();
        String s2 =new String("abc");
        String s3 =new String(new char[]{'a','b','c'});
        System.out.println(s3.length());
        System.out.println(s3.isEmpty());
        System.out.println(s3.charAt(2));

        System.out.println(s2.equals(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println(s2.substring(1,2));
        System.out.println(s2.concat("125"));
        System.out.println(s2.replace('a','b'));

        String s4=new String("1-2-3-4-5-6");
        String[] str=s4.split("-");
        System.out.println(Arrays.toString(str));
        System.out.println(s2.toUpperCase(Locale.ROOT));
        String s5=s2.toUpperCase(Locale.ROOT);
        System.out.println(s5.toLowerCase(Locale.ROOT));

        String s6="     ab  c  ";
        System.out.println(s6.trim());
    }

}
