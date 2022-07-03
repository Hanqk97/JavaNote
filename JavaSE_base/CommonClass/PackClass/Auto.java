package CommonClass.PackClass;

public class Auto {
    public static void main(String[] args) {
        Integer i=12;//自动装箱int==》Integer
        System.out.println(i);
        System.out.println("----------------------");
        Integer i2= new Integer(12);//自动拆箱Integer==》int
        int num=i2;
        System.out.println(i2);
        System.out.println("----------------");
        System.out.println("compareTo方法");
        Integer t1=new Integer(11);
        Integer t2=new Integer(1);
        //只返回三个值0，-1，1
        System.out.println(t1.compareTo(t2));//return(x<y)?-1:{(x==y)?0:1};
        System.out.println("----------------");
        System.out.println("equals方法");
        Integer t3=new Integer(12);
        Integer t4=new Integer(12);
        System.out.println(t3==t4);//false,因为此处==比较的是两个对象的地址
        System.out.println(t3.equals(t4));//比较的底层封装的value值
        System.out.println("---------------");
        System.out.println("intValue方法");
        Integer t5=new Integer(120);
        System.out.println(t5.intValue());
        System.out.println("parseInt方法");
        Integer t6=Integer.parseInt("111");
        System.out.println(t6);
        System.out.println("toString方法");
        Integer t7=153;
        System.out.println(t7.toString());
    }
}

