package JavaOOP.Succeed;
//父类
public class SucceedFirst {
    public SucceedFirst(){
        System.out.println("调用了父类无参构造");
    }
    public int money=10_000_000;
    public void say(){
        System.out.println("It's time.");
    }
    //private 无法继承
    private int age=18;
    public int getAge() {
        return age;
    }
    protected String name="tion";
}
