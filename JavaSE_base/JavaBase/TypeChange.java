package JavaBase;

public class TypeChange {
    public static void main(String[] args) {
        int i =128;
        byte m =(byte)i;
        System.out.println(m);
        int a=1000000000;
        int b=30;
        long c1= a*b;
        long c2= (long)a*(long)b;
        System.out.println(c1);
        System.out.println(c2);
    }

}
