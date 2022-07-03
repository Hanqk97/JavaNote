package JavaOOP.In_Out;

public class Application {
    public static void main(String[] args) {
        System.out.println("Test 1");
        Out out=new Out();
        out.outer();
        Out.inner in= out.new inner();//通过外部类实现内部类
        in.getId();
        System.out.println("-----------------------------");
        //A a= new A();
        new A().eat();//没有名字初始化类
        //可以直接new接口
        User user=new User() {
            @Override
            public void Hello() {
                System.out.println("Hello");
            }
        };
    }
}
