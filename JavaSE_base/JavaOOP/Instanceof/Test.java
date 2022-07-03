package JavaOOP.Instanceof;

public class Test {
    public static void main(String[] args) {
        Object num2=new Num2();

        //Object==>Num1==>Num2
        System.out.println(num2 instanceof Object );
        System.out.println(num2 instanceof Num1 );
        System.out.println(num2 instanceof Num2 );
        System.out.println(num2 instanceof Num3 );
        System.out.println(num2 instanceof String );
        System.out.println("----------------------");

        Num1 num1=new Num1();
        System.out.println(num1 instanceof Object );
        System.out.println(num1 instanceof Num1 );
        System.out.println(num1 instanceof Num2 );
        System.out.println(num1 instanceof Num3 );
        //String和Num1同级所以不能检测：Object==》Num1；Object==》String
        // System.out.println(num1 instanceof String );

        System.out.println("----------------------");
        Num3 num3=new Num3();
        System.out.println(num3 instanceof Object );
        System.out.println(num3 instanceof Num1 );
        //System.out.println(num3 instanceof Num2 );
        System.out.println(num3 instanceof Num3 );
        //System.out.println(num3 instanceof String );
    }
}
