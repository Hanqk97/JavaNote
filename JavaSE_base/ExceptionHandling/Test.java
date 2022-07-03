package ExceptionHandling;

public class Test {
    //可能会存在异常的方法
    static void test(int a) throws MadeException{
        if(a>10){throw new MadeException(a);}
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(1);
        } catch (MadeException e) {
            System.out.println("MadeException"+e);;
        }
    }
}
