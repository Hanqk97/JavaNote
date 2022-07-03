package JavaBase;

public class VarStaF {
    static int a =322354334;//类变量
    String name="Chen";//实例变量
    int age=3;//实例变量

    public static void main(String[] args) {
        int i =10;//局部变量
        System.out.println(i);
        VarStaF varStaF= new VarStaF();
        System.out.println(varStaF.name);
        System.out.println(varStaF.age);
        System.out.println(a);
    }

}
