package ExceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {//try 监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){//捕获异常。进行多个捕获时最高级在最下面。捕获异常后在下个异常捕获时不再被捕获。
            System.out.println("It's an exception!");
        }catch (Throwable e){
            System.out.println("Problem!");
        }finally {//无论是否有异常都会输出finally
            System.out.println("Fin");
        }
        //try,catch必须使用。finally可以省略，一般用来关闭IO流等。

        try{
            new Demo1().a();
        }catch(Throwable e){//catch(捕获类型，最高级为Throwable)。
            System.out.println("Error!");
        }

    }

    public void a(){b();}
    public void b(){a();}
}
